//
//  Exercise 3.4
//  ThinkJava - Chapter 3
//
//  Created by Milou Zwart on 6/11/2018.
//
import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {

    public static void main(String args[]) {

        Scanner console = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.println("Type a number: ");

        int guess = console.nextInt();
        Random random = new Random();
        int answer = random.nextInt(100) + 1;

        System.out.printf("Your guess is: %d\n", guess); // add new line because otherwise printf posts everything on the same line
        System.out.printf("The number I was thinking of is %d\n", answer);
        System.out.printf("You were off by %d", Math.abs(guess - answer));

    }

}
