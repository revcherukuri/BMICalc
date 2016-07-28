package bmi;
import java.util.Scanner;
public class bmi {
 static double bmi = 0.0;
 public static void main(String[]args)
 {
  printOutput();
 }
 
 public static void printOutput()
 {
  Scanner read = new Scanner(System.in);
  System.out.println("Before we begin, would you prefer entering your height and weight in (kg/meters - 1) or (lb/feet - 2)?");
  int answer = read.nextInt();
  if(answer == 1){
  System.out.println("Please enter your height in meters");
  double height = read.nextDouble();
   System.out.println("Please enter your weight in kilos");
   double weight = read.nextDouble();
   bmi = weight/(height*height);
   System.out.println("Your body mass index is " + bmi + " kg/m^2");
  
  }
  else if(answer == 2){
   System.out.println("Please enter your height in feet");
   double feet = (read.nextDouble())*12;
   System.out.println("Please enter your remaining inches");
   double inches = (read.nextDouble());
   double height1 = feet + inches;
   System.out.println("Please enter your weight in pounds");
   double weight1 = (read.nextDouble());
   bmi = (weight1/(height1*height1))*703;
   System.out.println("Your body mass index is " + bmi + " lb/in^2");
   
  }
  
  
  System.out.println("Let's see if you are healthy"); 
	  if(bmi <= 24 && bmi >= 19)
	  {
		  if(bmi >= 22)
		  {
			  System.out.println("You are in the healthy range, but you are nearing the overweight range");
		  }
		  else if(bmi < 22){
			  System.out.println("You are in the healthy range");
		  }
	  }
	  else if(bmi >= 25 && bmi <= 29)
	  {
		  if(bmi > 27)
		  {
			  System.out.println("You are overweight, and are nearing the obese category");
		  }
		  else if(bmi <= 27)
		  {
			  System.out.println("You are just a bit overweight");
		  }
	  }
	  else if(bmi >= 30 && bmi <= 35)
	  {
		  if(bmi >= 33)
		  {
			  System.out.println("Watch your health, you are very obese");
		  }
		  else if(bmi < 33)
		  {
			  System.out.println("You are fairly obese");
		  }
	  }
	  else if(bmi < 19)
	  {
		  System.out.println("You are a bit underweight");
	  }
	  else if(bmi > 35)
	  {
		  System.out.println("You're obesity is a danger to your health");
	  }
  }
  
 }

//}