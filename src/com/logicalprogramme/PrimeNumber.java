package com.logicalprogramme;
import java.util.Scanner;

//Program to check prime number
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int foundPrime = 0;
        System.out.println("Kindly enter a number to check it is prime or not");
        number = scanner.nextInt();
        int i=2;
        if(number==0 || number==1){
            foundPrime = 1;
        }else {
            while (i <= number / 2) {
                if (number % i == 0) {
                    foundPrime = 1;
                }
                i++;
            }
        }
        if (foundPrime==1){
            System.out.println("Its not a prime");
        } else {
            System.out.println("Its a prime number");
        }
    }
}
