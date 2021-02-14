package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArraysNo1();
        ArraysNo2();
        ArraysNo3();
    }

    public static void ArraysNo1() {
        int[] myNumbers = new int[]{5, 3, 7, 6, 2, 8};
        int i = 0;
        for (i = 0; i < myNumbers.length; i++)
            System.out.println("For loop: " + myNumbers[i]);
        for (int numbVar : myNumbers)
            System.out.println("For Each loop: " + numbVar);
        i = 0;
        while (i < myNumbers.length) {
            System.out.println("While loop: " + myNumbers[i]);
            i++;
        }
        i = 0;
        do {
            System.out.println("Do While loop: " + myNumbers[i]);
            i++;
        } while (i < myNumbers.length);

    }
    //For this assignment I would personally prefer For Each loop

    public static void ArraysNo2() {
        int[] myElements = new int[]{10, 4, -4, 7, 0, 9, 1, 3, 7, -5};
        int i = 0;
        int count = 0;
        int sum = 0;
        double average = 0;
        int averageVal = 0;

        for (int elementVar : myElements)
            if (elementVar < 0) {
                System.out.println("Negative element: " + elementVar);
            }
        for (int elementVar : myElements)
            if (elementVar % 2 != 0) {
                System.out.println("Odd element: " + elementVar);
                count++;
            }
        System.out.println("Array contains " + count + " odd elements.");
        for (i = 0; i < myElements.length; i++) {
            for (int j = i + 1; j < myElements.length; j++) {
                if (myElements[i] == (myElements[j])) {
                    System.out.println("There are multiple elements with the same value. It is: " + myElements[j]);
                }
            }
        }
        for (i = 0; i < myElements.length; i += 2)
            System.out.println("Each second element: " + i);

        for (int elementVar : myElements) {
            sum += elementVar;
            average = sum / myElements.length;
            if (elementVar < average)
                averageVal++;
        }

        System.out.println("Average value of array is " + average);
        System.out.println("There are " + averageVal + " values smaller than average value.");

    }

    public static void ArraysNo3() {
        System.out.println("Your limit is 10 grades!");
        byte[] grades = new byte[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Write students' grades! After each grade press ENTER!");
        byte i = 0;
        byte eachGrade = 0;
        for (i = 0; i < grades.length; i++) {
            while (!input.hasNextByte()) {
                System.out.println("That's not a number!");
                input.next();
            }
            eachGrade = input.nextByte();
            if ((eachGrade <= 10 && eachGrade >= 0)) {
                grades[i] = eachGrade;
            } else {
                i--;
                System.out.println("Grades' value should be between 0 and 10.");
            }

        }
        int failedCount = 0;
        int aCount = 0;
        for (byte x : grades) {
            if (x < 4 && x >= 0) {
                failedCount++;
            }
            if (x == 10) {
                aCount++;
            }
        }
        System.out.println("Number of students that failed in the exam: " + failedCount);
        System.out.println("Number of students that were excellent in the exam: " + aCount);
        for(i = 0; i <= grades.length; i++) {
            byte count = 0;
            for(byte j = 0; j < grades.length; j++) {
                if (grades[j] == i) {
                    count++;
                }
            }
            System.out.println(count + " students with the grade " + i);
        }


    }

}






