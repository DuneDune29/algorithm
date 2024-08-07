package Array;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arrayA = new int[size];
        int[] arrayB = new int[size];

        for(int i = 0; i < size; i++) {
            arrayA[i] = scanner.nextInt();
        }

        for(int i = 0; i < size; i++) {
            arrayB[i] = scanner.nextInt();
        }

        for(int i = 0; i < size; i++) {
            if(arrayA[i] > arrayB[i] && arrayA[i] - arrayB[i] == 1) {
                System.out.println("A");
            } else if(arrayB[i] > arrayA[i] && arrayB[i] - arrayA[i] == 1) {
                System.out.println("B");
            } else if(arrayA[i] < arrayB[i] && arrayB[i] - arrayA[i] == 2) {
                System.out.println("A");
            } else if(arrayB[i] < arrayA[i] && arrayA[i] - arrayB[i] == 2) {
                System.out.println("B");
            } else {
                System.out.println("D");
            }
        }
    }
}


/*
 *
 * 5
 * 2 3 3 1 3
 * 1 1 2 2 3
 */

