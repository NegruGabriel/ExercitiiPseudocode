package Problem3;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        //Write a program that prints the next 20 leap years.
        int year = 2022;
        int c = 20;
        int count = 0;
        while (count !=c){
            year = year +1;
            if((year%400 == 0)|| (year% 100 !=0)){
                count++;
                System.out.println(year);
            }
        }
        //Pseodocode
        //citeste an;
        //counter = 0;
        //cat timp counter != 20
        //daca an % 400 == 0 atunci
        //afiseaza an
        //counter ++
        //daca an % 100 == 0 atunci
        //nu afisa an
        //daca an % 4 == 0 atunci
        //afiseaza an
        //counter++
        //an++
    }
}
