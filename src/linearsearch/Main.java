/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 26/03/20
 *   Time: 9:18 AM
 */

package linearsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This class will be used to demonstrate linear search.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("How many elements do you want in the array?");
        final Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] numbers = new int[numberOfElements];
        // set random values in the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Enter the number to search for");
        int numberToSearchFor = scanner.nextInt();
        try {
            System.out.println(findNumberInIntegerArray(numbers, numberToSearchFor));
        } catch (NumberNotFoundInArrayException e) {
            System.out.println("Number not found in the Array!");
        }
        scanner.close();
    }

    /**
     * Finds an integer number in a given integer array.
     *
     * @param array  the integer array in which the number is to be searched.
     * @param number the number to search for.
     * @throws NumberNotFoundInArrayException throws this exception if the number is not present in the array.
     */
    private static String findNumberInIntegerArray(int[] array, int number) throws NumberNotFoundInArrayException {
        ArrayList<Integer> foundPosition = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                foundPosition.add(i);
            }
        }
        return (foundPosition.size() > 0)? "your number is found at " + foundPosition + ((foundPosition.size() > 1)? " places":" place"): "your number is not found";

    }

}

class NumberNotFoundInArrayException extends Exception {
    public NumberNotFoundInArrayException(String message) {
        super(message);
    }
}
