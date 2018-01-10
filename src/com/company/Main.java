package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome, enter a number:");

        Scanner sc = new Scanner(System.in);
        String inputFromUser;
        inputFromUser = sc.nextLine();

        int convertedNumber = Integer.parseInt(inputFromUser);

        System.out.println("line 18: " + convertedNumber);
        convertedNumber = convertedNumber + 5;
        System.out.println("line 20: " + convertedNumber);

        System.out.println("Here is what you entered: " + inputFromUser);

        System.out.println("Welcome, enter a number:");
        //Scanner sc = new Scanner(System.in);
        //String inputFromUser;
        inputFromUser = sc.nextLine();

        System.out.println("Here is what you entered: " + inputFromUser);
    }
}


// int inputFromUser; Incompatible but String ok no matter what
// int ScottsNumber = 12345;
// String scottsStringNumber = "12345";
// scottsNumber
// write your code here


