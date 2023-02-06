package com.logicalprogramme;
import java.util.Scanner;

//Program to reverse a number
public class ReverseANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number,temporary;
        int sum = 0;
        System.out.println("Kindly enter a number to reverse");
        number = scanner.nextInt();

        while (number>0){
            temporary = number%10;
            sum = (sum*10) + temporary;
            number=number/10;
        }
        System.out.println("Reverse of number is:" + sum);
    }
}
