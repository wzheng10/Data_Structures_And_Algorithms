package com.zheng;

public class Main {

    public static void main(String[] args) {
        System.out.println(iterativeFactorial(6));
        System.out.println(recursiveFactorial(6 ));
    }




    public static int recursiveFactorial(int num) {

        //Base Case(Breaking condition)
        if(num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num -1);
    }

    // n! = n * (n - 1)!

    public static int iterativeFactorial(int num) {
        if(num == 0) {
            return 1;
        }

        int factorial = 1;
        for(int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
