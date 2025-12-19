import java.io.*;
import java.util.Scanner;

class Matrix {
    public static void main(String args[]) {
        int[][] a = new int[10][10];
        int[][] b = new int[10][10];
        int[][] c = new int[10][10];
        int N, i, j;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the order of a matrix");
        N = sc.nextInt();

        System.out.println("Enter the element of matrix A");
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of matrix B");
        // The loop to read Matrix B (bridging the gap between the two pages)
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sum of the matrix A and B is");

        // Loop to calculate the sum
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println();

        // Loop to print the result
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
