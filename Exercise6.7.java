//
//  Exercise 6.7
//  ThinkJava - Chapter 6
//
//  Created by Milou Zwart on 12/11/2018.
//
public class oddSum {

    public static int oddSum(int n) {

        if (n == 1) { // lowest odd number
            return 1;
        }

        else {

            int result = n + oddSum(n - 2); // n - 2 to keep the numbers odd
            return result;
        }
    }

    public static void main(String args[]) {

        System.out.println(oddSum(3)); // put any odd number in

    }

}
