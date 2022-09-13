
package example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a program that stores a message and has methods for getting the message,
 * updating the message and printing it out in all caps. Write a `main()` method
 * for testing this class.
 *
 * Create a:
 * - Getter
 * - Setter
 * - Constructor
 * - printMe
 * - shout
 * - toString
 */
public class Sum {
    public static void main(String[] args) {
        /**
         * new - Creates a new Scanner object. (Think of it like C Malloc, but Java's
         * garbage collection frees it)
         * Scanner is an object that allows us to specify an input
         * System.in == stdin in C
         */
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        /**
         * Keeps reading input until it sees a \n
         *
         * Splits each string into an array of strings
         */
        String[] numbers = input.split(" ");

        int sum = 0;
        for (String number : numbers) {
            // sum += number;
            sum += Integer.parseInt(number);
            // sum = sum + Integer.parseInt(number);
        }
        System.out.println("The sum is " + sum);

        /**
         * Frees I/O resources
         * Java's garbage collector only manages memory, not other resources
         */
        scanner.close();

        // System.out.println(String.format("The sum is %d", streamSum));

    }
}
