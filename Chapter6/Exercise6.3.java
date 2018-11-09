//
//  Exercise 6.3
//  ThinkJava - Chapter 6
//
//  Created by Milou Zwart on 9/11/2018.
//
public class sticks {

    public static boolean isTriangle(int a, int b, int c) {

        return (a > 0 && b > 0 && c > 0 && b + c >= a && a + c >= b && a + b >= c);

    }

}
