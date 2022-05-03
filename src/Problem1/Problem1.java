package Problem1;

import java.util.Arrays;

public class Problem1 {
    //Write a program that selects the smallest  number from an array.
    public static void main(String[] args) {
        int  [] number = new int []{ 87,25,91,65,56,11 };
        int min  = number[0];
        for(int n = 0;n<number.length;n++){
            if(number[n]<min)
                min=number[n] ;
            System.out.println(number[n]);
        }
        System.out.println("Smallest number from the array is: "+min);
        }
        //Pseodocode
        //citeste lista;
        //min = lista[0]
        //pentru numar in lista
        //daca numar < min atunci
        //min = numar
        //afiseaza min;
    }

