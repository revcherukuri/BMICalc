package calc;
import java.util.Scanner;
public class game
{

 

    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);

        int lo = 0, hi = 1000000;

        System.out.println("Think of an integer between " + lo + " and " + hi + ".");

        System.out.println("Truthfully answer 'true' or 'false' to each question I ask.");

        System.out.println();

 

        for (int i = 1; lo < hi; i++) {

 

            // invariant:  number must be in the interval [lo, hi]

            int mid = lo + (hi - lo) / 2;

            System.out.print("Q" + i + ": ");

            System.out.println("Is your number <= " + mid + "?");

//            boolean response = StdIn.readBoolean();
            boolean response = read.nextBoolean();


            if (response) hi = mid;

            else          lo = mid + 1;

        }

 

        System.out.println("Your integer is " + lo + ".");

        System.out.println();

    }

 

}

