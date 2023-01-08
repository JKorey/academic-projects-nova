package assignment_01;

import java.util.Scanner;

public class Assignment_01 {

    public static  void main(String[] arg){

        double paintTimeOne = 45;           //minutes
        double paintDistanceTwo = 2000;     //Square Yard

        System.out.println("Who are the two painters?");
        Scanner keyboard = new Scanner(System.in);
        System.out.println(">>Painter one:");
        String painterOne = keyboard.nextLine();
        System.out.println(">>Painter two:");
        String painterTwo = keyboard.nextLine();

        //Remove last names of painters
        int nameChangeOne = painterOne.indexOf(" ");
        int nameChangeTwo = painterTwo.indexOf(" ");
        painterOne = painterOne.substring(0, nameChangeOne);
        painterTwo = painterTwo.substring(0, nameChangeTwo);

        System.out.println(">>The two painters are " + painterOne + " and " + painterTwo+ "!");
        System.out.println("How many square yards can " + painterOne + " paint in " +paintTimeOne+ " minutes?");
        double paintDistanceOne = keyboard.nextDouble();

        double convTime = paintTimeOne / 60;     //Time conversion
        double painterOneRate = paintDistanceOne / convTime;
        System.out.println("How many hours does it take " + painterTwo+ " to paint "+paintDistanceTwo+ " square yards?");
        double convFeet = paintDistanceTwo * 9;  // Convert to Square Feet
        double paintTimeTwo = keyboard.nextDouble();
        double painterTwoRate = convFeet / paintTimeTwo;
        System.out.println("How many total square feet do they need to paint?");
        double neededDistance = keyboard.nextDouble();
        painterOneRate = painterOneRate * neededDistance;
        painterTwoRate = painterTwoRate * neededDistance;
        double combRate = painterOneRate + painterTwoRate;
        double finalSolution = neededDistance / combRate;
        System.out.println("It will take them " +finalSolution+ " hours, if they work together at the some time!!!!");

    }
}
