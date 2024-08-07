package Array;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        int first = 0;
        int result = 0;

        for(int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        for(int i = 0; i < size; i++) {
            if(first < array[i]) {
                result++;
                first = array[i];
            }
        }
        System.out.print(result);
    }
}


/*
 *
 * 8
 * 130 135 148 140 145 150 150 153
 */

