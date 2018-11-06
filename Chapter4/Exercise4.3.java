//
//  Exercise 4.3
//  ThinkJava - Chapter 4
//
//  Created by Milou Zwart on 6/11/2018.
//
public class DateTwo {

    public static void printAmerican(String day, String month, int date, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year){
        System.out.println(day + " " + date + " " + month + " " + year);
    }

    public static void main(String[] args) {
        String day = "Friday", month = "July";
        int date = 6, year = 2018;

        //American format
        System.out.println("American format:");
        printAmerican(day, month, date, year);

        //European format
        System.out.println("European format:");
        printEuropean(day, date, month, year);
    }

}
