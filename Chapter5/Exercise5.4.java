//
//  Exercise 5.4
//  ThinkJava - Chapter 5
//
//  Created by Milou Zwart on 6/11/2018.
//
public class FermatTheorem {

    public static void checkFermat(int a, int b, int c, int n){

        if ((n > 2) && (Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n))) {
            System.out.println("Holy Smokes, Fermat was wrong!");
        }
        else {
            System.out.println("No that doesn't work.");
        }

    }

    public static void main(String args[]) {

        checkFermat(); //put values in to run the check
    }

}
