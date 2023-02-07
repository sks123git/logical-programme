package com.logicalprogramme;
import java.util.Scanner;

//Program to print fibonacci series
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly enter a number to see upto fibonacci series");
        int size = scanner.nextInt();
        int sum = 0, number1=0, number2=1;
        System.out.println("Fibonacci series: ");
        System.out.println("0");
        System.out.println("1");
        int i=0;
        while (i<size-2){
            sum=number1+number2;
            number1=number2;
            number2=sum;
            System.out.println(sum);
            i++;
        }

    }
}
