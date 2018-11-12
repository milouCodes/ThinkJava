//
//  Exercise 6.8
//  ThinkJava - Chapter 6
//
//  Created by Milou Zwart on 12/11/2018.
//
//  Not entirely sure about this one
//
public class pow {

    public static double power (double x, int n) {

        if (x == 0) {
            return 0;
        }

        else if (x > 0) {

            if (n == 0) { // anything raised to the zeroth power is 1
                return 1;
            }

            else {
                return x * Math.pow(x, (double) n - 1);
            }

        }

        else {
            
            return 0; // error
            
        }


    }

    public static void main (String args[]) {

        System.out.println(power(2,3));

    }

}
