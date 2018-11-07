//
//  Exercise 5.7
//  ThinkJava - Chapter 5
//
//  Created by Milou Zwart on 6/11/2018.
//
import java.util.Scanner;
import java.util.Random;

    public class GuessNumber {

        private static Scanner console = new Scanner(System.in); // exercise says make two methods, but I can't make it work with two? Why?


        public static void main(String args[]) {

            Random random = new Random();
            int answer = random.nextInt(100) + 1;
            guess(answer);

        }

        private static void guess(int answer) {
            System.out.println("I'm thinking of a number between 1 and 100");
            System.out.println("Can you guess what it is?");
            System.out.println("Type a number:");

            int input = console.nextInt();

            if (input == answer) {
                System.out.println(answer + " is correct!");
            }
            else {
                System.out.println(input + " is too " + (input > answer ? "high" : "low"));
                System.out.println("Try again:");
                guess(answer);
            }
        }

    }




