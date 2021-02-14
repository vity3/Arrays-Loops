package com.company;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int [] myArr = {8, 2, 3, 1, 5, 7};
        System.out.println("Array in original order: " + Arrays.toString(myArr));
        Reverse(myArr);
        System.out.println("Array in reverse order: " + Arrays.toString(myArr));

    }

    public static void Reverse(int[] myArr) {
        for (int i = 0; i < myArr.length / 2; i++) {
            int reverseArr = myArr[i];
            myArr[i] = myArr[myArr.length - 1 - i];
            myArr[myArr.length - 1 - i] = reverseArr;
        }
    }
}
