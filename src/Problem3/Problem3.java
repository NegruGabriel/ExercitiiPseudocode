package Problem3;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        //Write a program that prints the  20 leap years.
        int year = 2022;
        int counter = 0;
        while (counter != 20) {
            if (year % 400 == 0) {
                System.out.println(year);
                counter++;
            } else if (year % 100 == 0) {
            } else if (year % 4 == 0) {
                System.out.println(year);
                counter++;
            }
            year++;
        }

    }
}

            //Pseodocode
            //Read Year;
            //counter = 0;
            //while counter != 20
            //If Year % 400 == 0 atunci
            //Show Year
            //counter ++
            //If Year % 100 == 0 Else
            //don't show Year
            //If Year % 4 == 0 Else
            //Show Year
            //counter++
            //Year++


