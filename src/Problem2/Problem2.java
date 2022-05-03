package Problem2;

import java.time.LocalDate;
import java.time.Period;

public class Problem2 {
    public static void main(String[] args) {
        //Write a program that calculates your age when you provide the year when you were born.
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1985,10,16);
        int Years = Period.between (birthDate,today).getYears();
        System.out.println(birthDate);
        System.out.println(today);
        System.out.println(Years);
        //Pseodocode
        //citeste anNastere;
        //citeste anCurent;
        //varsta = anCurent - anNastere;
        //afiseaza varsta;


    }
}
