//
//  Exercise 3.3
//  ThinkJava - Chapter 3
//
//  Created by Milou Zwart on 6/11/2018.
//
import java.util.Scanner;

public class ConvertTime {

    public static void main(String []args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Input the time in seconds: ");
        int temp = console.nextInt(); //input

        //convert
        int hour = temp / 3600; // get the amount of hours
        int seconds = temp % 3600; // how many seconds left after the hour
        int minute = seconds / 60; // out of those seconds how many of those can be converted to minutes
        seconds = seconds % 60; // to get the leftover seconds

        System.out.printf("%d second(s) = %d hour(s), %d minute(s), %d second(s)", temp, hour, minute, seconds);

    }

}
