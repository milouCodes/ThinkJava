//
//  Exercise 6.2
//  ThinkJava - Chapter 6
//
//  Created by Milou Zwart on 9/11/2018.
//
public class divisible {

    public static boolean isDivisible(int n, int m) {

        return (n % m == 0 && m != 0); // also != 0, otherwise you get an error: / by zero

    }

    // only here to test it
    public static void main(String args[]) {
        System.out.println(isDivisible(6,2)); 
    }

}
