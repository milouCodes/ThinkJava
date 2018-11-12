//
//  Exercise 7.2
//  ThinkJava - Chapter 7
//
//  Created by Milou Zwart on 12/11/2018.
//
public class findroot {

    public static double squareRoot(double a) {

            double one = a / 2 ;
            double approximation = 0 ;

        do {

            double zero = one;
            one = ((zero + (a / zero)) / 2);
            approximation = Math.abs(one - zero);
            System.out.println(approximation);
        }

        while (approximation > 0.001);

        return one;

    }

    public static void main(String args[]) {

        System.out.println(squareRoot(9));

    }

}
