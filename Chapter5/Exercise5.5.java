//
//  Exercise 5.5
//  ThinkJava - Chapter 5
//
//  Created by Milou Zwart on 6/11/2018.
//
public class bottlesofbeer {

    public static void lyrics(int beerNumber) {

        if (beerNumber> 0) {
            System.out.println(beerNumber + " bottles of beer on the wall,");
            System.out.println(beerNumber + " bottles of beer,");
            System.out.println("ya’ take one down, ya’ pass it around,");
            System.out.print(--beerNumber + " bottles of beer on the wall.\n\n"); // put whitespace between verses
            lyrics(beerNumber);
        }

        else {
            System.out.print("No bottles of beer on the wall,\nno bottles of beer,\nya’ can’t take one down, ya’ can’t pass it around,\n’cause there are no more bottles of beer on the wall!"); // can also use separate println for every new line
        }
    }

    public static void main(String args[]) {
        lyrics(3);
    }

}

