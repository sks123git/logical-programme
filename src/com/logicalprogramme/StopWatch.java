package com.logicalprogramme;
import java.util.Scanner;

//Program to find random numbers needed to generate distinct N number of coupons
public class StopWatch {
    public static long startTime = 0;
    public static long stopTime = 0;
    public static long difference;
    public static long startTime(){          //Start the time and return
        startTime = System.currentTimeMillis();
        return startTime;
    }

    public  static long stopTime(){             //Stop the time and return
        stopTime = System.currentTimeMillis();
        return stopTime;
    }

    public static long elapsedTime(long startTime, long stopTime){               //calculate elapsed time and return
        long elapsedTime=(stopTime-startTime)/1000;
        return elapsedTime;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly enter a key to start");
        char start=scanner.next().charAt(0);
        startTime = startTime();
        System.out.println("Kindly enter a key to stop");
        char stop=scanner.next().charAt(0);
        stopTime = stopTime();
        difference = elapsedTime(startTime,stopTime);
        System.out.println("The elapsed time is "+ difference);
    }
}
