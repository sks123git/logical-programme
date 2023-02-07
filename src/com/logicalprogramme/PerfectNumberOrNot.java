package com.logicalprogramme;
import java.util.Scanner;

// Perfect Number program
public class PerfectNumberOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum=0;
        System.out.println("Kindly enter a number to find if its a perfect number");
        num = scanner.nextInt();
        for (int i = 1; i < num; i++) {
            if(num%i==0){                   //checking which is perfectly divisible and taking their sum
                System.out.print(i + " ");
                sum+=i;
            }
        }
        System.out.println(" ");
        if(sum==num){                       //comparing
            System.out.println("Its a perfect number");
        }else {
            System.out.println("Its not a perfect number");
        }
    }
}
