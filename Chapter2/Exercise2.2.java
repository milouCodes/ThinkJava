//
//  Exercise 2.2
//  ThinkJava - Chapter 2
//
//  Created by Milou Zwart on 6/11/2018.
//
public class Date {

    public static void main(String[] args) {
        String day = "Friday", month = "July";
        int date = 6, year = 2018;

        //Display the value of each variable on a line by itself
        System.out.println(day);
        System.out.println(month);
        System.out.println(date);
        System.out.println(year);

        //American format
        System.out.println("American format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);

        //European format
        System.out.println("European format:");
        System.out.println(day + " " + date + " " + month + " " + year);
    }

}
