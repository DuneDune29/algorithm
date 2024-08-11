package TwoPointersSlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        int[] distinctArray = new int[size1];
        for(int i = 0; i < size1; i++){
            for(int j = 0; j < size2; j++){
                if(array1[i] == array2[j]) {
                    distinctArray[i] = array1[i];
                }
            }
        }

        int[] tempArray = new int[size1];
        for(int i = 0; i < distinctArray.length; i++) {
            for(int j = 0; j < distinctArray.length; j++){
                if(distinctArray[i] < distinctArray[j]) {
                    tempArray[i] = distinctArray[i];
                    distinctArray[i] = distinctArray[j];
                    distinctArray[j] = tempArray[i];
                }
            }
        }

        for(int i : distinctArray) {
            if(i != 0) {
                System.out.print(i + " ");
            }
        }
    }
}


/*
5
1 3 9 5 2
5
3 2 5 7 8
 */

