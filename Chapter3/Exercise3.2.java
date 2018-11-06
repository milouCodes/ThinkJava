//
//  Exercise 3.2
//  ThinkJava - Chapter 3
//
//  Created by Milou Zwart on 6/11/2018.
//
import java.util.Scanner;

public class Temperature {

    public static void main(String args[]) {

      Scanner console = new Scanner(System.in);

      System.out.print ("Input temperature in Celsius: ");
      double temperature = console.nextDouble(); //get input
      double tempereratureInFahrenheit = temperature * 9 / 5 + 32; //convert to Fahrenheit
      System.out.printf("%.1f C = %.1f F", temperature, tempereratureInFahrenheit); //output

    }

}
