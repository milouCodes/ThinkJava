//
//  Exercise 6.8
//  ThinkJava - Chapter 6
//
//  Created by Milou Zwart on 12/11/2018.
//
public class Ackermann {

    public static int ack(int m, int n) {

        if (m == 0) {
            return n + 1;
        }

        else if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        }

        else if (m > 0 && n > 0) {
            return ack(m - 1, ack(m, n -1));
        }

        else {
            return 0;
        }

    }

    public static void main (String args[]) {

        System.out.println(ack(1,1)); // put any value in 

    }

}
