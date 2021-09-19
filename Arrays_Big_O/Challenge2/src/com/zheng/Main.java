package com.zheng;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        recursionInsertionSort(intArray, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void recursionInsertionSort(int[] input, int n) {
        if (n < 2) {
            return;
        }

        recursionInsertionSort(input, n - 1);

        int newElement = input[n - 1];

        int i;

        for (i = n - 1; i > 0 && input[i - 1] > newElement; i--) {
            input[i] = input[i - 1];
        }

        input[i] = newElement;
        System.out.println("Result of all when n = " + n);
        for(i = 0; i < input.length; i ++) {
            System.out.print(input[i]);
            System.out.print(", ");
        }
        System.out.println("");
        System.out.println("---------------------------");
    }
}
