package bmi;
import java.util.Scanner;
public class bmi {
 
 public static void main(String[]args)
 {
  printOutput();
 }
 
 public static void printOutput()
 {
  Scanner read = new Scanner(System.in);
  System.out.println("Before we begin, would you prefer entering your height and weight in kg/meters or lb/feet?");
  String answer = read.next();
  if(answer.equals("kg/meters")){
  System.out.println("Please enter your height in meters");
  double height = read.nextDouble();
   System.out.println("Please enter your weight in kilos");
   double weight = read.nextDouble();
   double bmi = weight/(height*height);
   System.out.println("Your body mass index is " + bmi + " kg/m^2");
  
  }
  else if(answer.equals("lb/feet")){
   System.out.println("Please enter your height in feet");
   double feet = (read.nextDouble())*12;
   System.out.println("Please enter your remaining inches");
   double inches = (read.nextDouble());
   double height1 = feet + inches;
   System.out.println("Please enter your weight in pounds");
   double weight1 = (read.nextDouble());
   double bodymassindex = (weight1/(height1*height1))*703;
   System.out.println("Your body mass index is " + bodymassindex + " lb/in^2");
   
  }
  
  
  System.out.println("Let's see if you are healthy");
  //System.out.println("What is your height? Please write feet'inches''");
  //String finalheight = read.next();
  //if(finalheight.equals("4'10''"))
  //{
	  System.out.println("What was your bmi? (2 decimal places)");
	  double finalbmi = read.nextDouble();
	  if(finalbmi <= 24 && finalbmi >= 19)
	  {
		  if(finalbmi >= 22)
		  {
			  System.out.println("You are in the healthy range, but you are nearing the overweight range");
		  }
		  else if(finalbmi < 22){
			  System.out.println("You are in the healthy range");
		  }
	  }
	  else if(finalbmi >= 25 && finalbmi <= 29)
	  {
		  if(finalbmi > 27)
		  {
			  System.out.println("You are overweight, and are nearing the obese category");
		  }
		  else if(finalbmi <= 27)
		  {
			  System.out.println("You are just a bit overweight");
		  }
	  }
	  else if(finalbmi >= 30 && finalbmi <= 35)
	  {
		  if(finalbmi >= 33)
		  {
			  System.out.println("Watch your health, you are very obese");
		  }
		  else if(finalbmi < 33)
		  {
			  System.out.println("You are fairly obese");
		  }
	  }
  }
  
 }

//}