/*
 * Student: Allison Eckert
 * Course: CIS 171 - Java Programming
 * Instructor: Karen Lentz-O'Loughlin
 * Assignment: Module 7 - Bubble Sort
 * File: BubbleSort_Eckert.java
 *
 * Description:
 * This program uses the Bubble Sort algorithm to
 * arrange an array of integers in ascending order.
 *
 * Source Attribution:
 * Based on Bubble Sort starter code provided by
 * instructor Karen Lentz-O'Loughlin.
 *
 * AI Assistance:
 * ChatGPT (OpenAI) assisted with code organization,
 * troubleshooting, explanations, and documentation.
 */

import java.util.Arrays;

public class BubbleSort_Eckert {

    public static void main(String[] args) {

        // Create an array of unsorted integers.
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        // Display the original array.
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(numbers));

        // Sort the array using Bubble Sort.
        bubbleSort(numbers);

        // Display the sorted array.
        System.out.println("\nSorted Array:");
        System.out.println(Arrays.toString(numbers));
    }

    /*
     * Method: bubbleSort
     * Purpose: Sort an integer array in ascending order.
     *
     * Parameters:
     * numbers - the array of integers to sort.
     *
     * This method repeatedly compares adjacent values
     * and swaps them when they are out of order.
     */
    public static void bubbleSort(int[] numbers) {

        int n = numbers.length;
        boolean swapped;

        // Each pass moves the largest remaining value
        // into its correct position.
        for (int i = 0; i < n - 1; i++) {

            swapped = false;

            // Compare adjacent elements.
            for (int j = 0; j < n - i - 1; j++) {

                if (numbers[j] > numbers[j + 1]) {

                    // Swap elements that are out of order.
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;

                    swapped = true;
                }
            }

            // Stop early if no swaps were needed.
            if (!swapped) {
                break;
            }
        }
    }
}

/*
 * SOURCE DOCUMENTATION
 *
 * 1. Karen Lentz-O'Loughlin
 *    CIS 171 Module 7 Bubble Sort Assignment.
 *    Instructor-provided starter code and directions.
 *
 * 2. OpenAI ChatGPT (2026)
 *    Assistance with Java code organization,
 *    Bubble Sort implementation, debugging,
 *    and documentation.
 *
 * 3. Java Standard Library
 *    java.util.Arrays
 *    https://docs.oracle.com/en/java/
 *
 * Note:
 * The Bubble Sort algorithm compares neighboring
 * elements and swaps them until the array is sorted.
 */
