package Array;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int[] arrayTemp = new int[size*2+2] ;
        int[] horizonTotalArr = new int[size];
        int[] verticalTotalArr = new int[size];
        int rightDiagona = 0;
        int leftDiagona = 0;

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                horizonTotalArr[i] += array[i][j];
                verticalTotalArr[i] += array[j][i];
                if(i == j) {
                    rightDiagona += array[i][j];
                }
                if(i + j == size-1) {
                    leftDiagona += array[i][j];
                }
            }
        }

        System.arraycopy(horizonTotalArr, 0, arrayTemp, 0, size);
        System.arraycopy(verticalTotalArr, 0, arrayTemp, size, size);
        arrayTemp[size*2] = rightDiagona;
        arrayTemp[size*2+1] = leftDiagona;

        int largePoint = 0;

        for(int i : arrayTemp) {
            if(i > largePoint){
                largePoint = i;
            }
        }

        System.out.print(largePoint);

    }
}

/*
 * 5
 * 10 13 10 12 15
 * 12 39 30 23 11
 * 11 25 50 53 15
 * 19 27 29 37 27
 * 19 13 30 13 19
 *
 */
/*
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19

60 115 154 139 94
*/
