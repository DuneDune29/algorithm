package Array;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }

        System.out.print(array[0]);

        for(int i = 1; i < size; i++) {
            if(array[i] > array[i-1]){
                System.out.print(" " + array[i]);
            }
        }
    }
}


/*
 *
 * 6
 * 7 3 9 5 6 12
 */

