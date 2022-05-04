package Problem4;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        //Write a program that solves a quadric equation
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = input.nextDouble();

        System.out.println("Enter b: ");
        double b = input.nextDouble();

        System.out.println("Enter c: ");
        double c = input.nextDouble();


        double x1 = input.nextDouble();
        double x2 = input.nextDouble();

        x1 =(-b + Math.sqrt(b*b-4*a*c))/(2*a);
        x2 =(-b - Math.sqrt(b*b-4*a*c))/(2*a);

        System.out.println(x1);
        System.out.println(x2);
    }
}
//Pseodocode
//Read  a;
//Read  b;
//Read  c;
//solutionOne = -b + sqrt(b^2 - 4 * a * c) / 2 * a
//solutionTwo = -b - sqrt(b^2 - 4 * a * c) / 2 * a
//Show solutionOne;
//Show solutionTwo;