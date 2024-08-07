package Array;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        array[0] = 1;
        array[1] = 1;

        for(int i = 2; i < size; i++) {
             array[i] = array[i-1] + array[i-2];
        }

        for(int i : array) {
            System.out.print(i + " ");
        }
    }
}


/*
 *
 * 10
 */

