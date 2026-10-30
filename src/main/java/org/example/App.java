package org.example;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();

        Integer[][] arrays = {
                {70, 61, 72, 83, 38},   // a
                {7, 2, 76, 4, 99},      // b
                {28, 9, 13, 78, 19},    // c
                {68, 84, 41, 62, 18},   // d
                {37, 57, 40, 13, 50}    // e
        };

        char label = 'a';
        for (Integer[] arr : arrays) {
            Integer[] sorted = bubbleSort.sort(arr);
            System.out.println(label + ") Before: " + Arrays.toString(arr));
            System.out.println("   After:  " + Arrays.toString(sorted));
            label++;
        }
    }
}