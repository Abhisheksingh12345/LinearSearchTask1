package binaysearch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tell = new Scanner(System.in);
        System.out.println("How many element do you want in array : ");
        int[] array = new int[tell.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Enter the element to be search : ");
        binarySearch(tell.nextInt(), array);
    }

    private static void binarySearch(int elementToBeSearch, int[] sortedArray) {
        int midTerm = (sortedArray.length + 1) / 2;
        int startingIndex = 0;
        int endIndex = sortedArray.length - 1;
        if (elementToBeSearch == midTerm) {
            System.out.println("Your element is found at position : " + midTerm);
        }
        if (sortedArray[midTerm] > elementToBeSearch) {
            searchElement(startingIndex, midTerm, sortedArray, elementToBeSearch);
        } else
            searchElement(midTerm, endIndex, sortedArray, elementToBeSearch);
    }

    private static void searchElement(int startingIndex, int endIndex, int[] array, int searchElement) {
        for (int i = startingIndex; i < endIndex; i++) {
            if (array[i] == searchElement) {
                System.out.println("Your element is found at position : " + (i+1));
            }

        }
    }
}
