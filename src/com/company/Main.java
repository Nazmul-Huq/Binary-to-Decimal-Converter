package com.company;

import javax.security.sasl.SaslClient;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // udskriv programs funcin til skaræm
        System.out.println("Omregn fra binær tal til decimal tal");
        // opret et object af scanner
        Scanner scanner = new Scanner(System.in);
        // skriv til skærm at bruger skal indsaste binær tal
        System.out.println("Indsats venligst bin tal");
        String str = scanner.next();

        //omregning
        int result = 0;
        for (int i = 0; i < str.length(); i++) {

            // get the character at index i
            char ch = str.charAt(i);

            // convert the character to the numeric value (0 or 1)
            int numericValue = Character.getNumericValue(ch);

            // calculate the value and add to the result
            result = (int) (result + Math.pow(2, i) * numericValue);
        }

        System.out.println("Decimal of given binary number: " + result);

    }
}
