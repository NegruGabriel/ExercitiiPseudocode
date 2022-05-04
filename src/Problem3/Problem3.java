package Problem3;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        //Write a program that prints the next 20 leap years.
        Scanner sc = new Scanner(System.in);
        System.out.print("Read year: ");
        int yourYear = sc.nextInt();
        // System.out.println("The  year is: " + yourYear);

        int c = 20;
        int count = 0;
        while (count != c) {
            yourYear = yourYear + 1;
            if ((yourYear % 400 == 0 || yourYear % 4 == 0)) {
                System.out.println(yourYear);
                count++;
            } else if ((yourYear % 100 == 0)) {
                System.out.println("no year");

            }
        }
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


