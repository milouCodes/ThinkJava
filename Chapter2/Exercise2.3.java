//
//  Exercise 3.3
//  ThinkJava - Chapter 3
//
//  Created by Milou Zwart on 6/11/2018.
//
public class Time {

    public static void main(String[] args) {
        // Time started this exercise
        int hour = 10, minute = 58, second = 20;

        // Display the number of seconds since midnight
        int secondsSinceMidnight = hour * 3600 + minute * 60 + second;
        System.out.println("Seconds since midnight: " + secondsSinceMidnight + " seconds");

        // Display the number of seconds remaining in the day
        int totalSecondsDay = 24 * 3600;
        int remainingSeconds = totalSecondsDay - secondsSinceMidnight;
        System.out.println("Number of seconds remaining in the day: " + remainingSeconds + " seconds");

        // Display percentage of the day that has passed
        System.out.println("Percentage of the day that has passed: " + (double)secondsSinceMidnight / (double)(totalSecondsDay) * 100 + "%");

        // Time elapsed since I started working on this exercise
        int newHour = 11, newMinute = 11, newSecond = 33;

        int newTimeInSeconds = newHour * 3600 + newMinute * 60 + newSecond;
        int elapsedTime = newTimeInSeconds - secondsSinceMidnight;

        System.out.println("Seconds elapsed since I started working on this exercise: " + elapsedTime + " seconds");

    }

}
