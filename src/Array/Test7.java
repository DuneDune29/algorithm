package Array;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int point = 0;
        int samePoint = 1;

        for(int i : array) {
            if(i == 1) {
                point = point + 1 * samePoint;
                samePoint++;
            } else {
                samePoint = 1;
            }
        }

        System.out.println(point);
    }
}

/*
 * 10
 * 1 0 1 1 1 0 0 1 1 0
 */
