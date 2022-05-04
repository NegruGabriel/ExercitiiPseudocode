package Problem2;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        //Write a program that calculates your age when you provide the year when you were born.
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input the year when you born : ");
        int bYear = sc.nextInt();
        System.out.println("The year when  you born : " + bYear);

        Scanner scn = new Scanner(System.in);
        System.out.print("Please input the current year : ");
        int currentYear = sc.nextInt();
        System.out.println("The current year is : " + currentYear);

        int yAge = (currentYear -bYear);
        System.out.println("My age is: " +yAge);

        //Pseodocode
        //Read Birth Year;
        //Read the current year;
        //the age = the current year - Birth Year;
        //Show age;


    }
}
