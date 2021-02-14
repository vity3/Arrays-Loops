package com.company;

public class array2D {
    public static void main(String[] args) {
        int n = 4;
        int[][] my2DArray = {{1, 2, 3, 4}, {4, 3, 2, 1}, {7, 8, 9, 6}, {6, 5, 4, 3}};
        principalDiagonal(my2DArray, n);
        secondaryDiagonal(my2DArray, n);
    }

    public static void principalDiagonal(int mat[][], int n) {
        System.out.print("Principal Diagonal: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(mat[i][j] + ", ");
                }
            }
        }
        System.out.println("");

    }

    public static void secondaryDiagonal(int mat[][], int n) {
        System.out.print("Secondary Diagonal: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) == (n - 1)) {
                    System.out.print(mat[i][j] + ", ");
                }
            }
        }
        System.out.println("");
    }

}
