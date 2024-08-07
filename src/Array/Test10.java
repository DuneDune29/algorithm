package Array;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[][] array = new int [size+2][size+2];

        for(int i = 1; i < array.length-1; i++) {
            for(int j = 1; j < array.length-1; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int total = 0;

        for(int i = 1; i < array.length-1; i++) {
            for(int j = 1; j < array.length-1; j++) {
                if(array[i][j] > array[i-1][j] &&
                   array[i][j] > array[i][j-1] &&
                   array[i][j] > array[i+1][j] &&
                   array[i][j] > array[i][j+1]) {
                    total++;
                }
            }
        }

        System.out.println(total);

    }
}

/*
 * 5
 * 5 3 7 2 3
 * 3 7 1 6 1
 * 7 2 5 3 4
 * 4 3 6 4 1
 * 8 7 3 5 2
 *
 * 1행 1열 이면 0행 1열, 1행 0열, 2행 1열, 1행 2열
 * if문으로 i가 0이 아닐경우, i가 길이-1이 아닐경우, j가 0이 아닐경우, j가 길이-1이 아닐경우
 * 위처럼 i-1과 비교, j-1과 비교, i+1과 비교, j+1과 비교해서 true일경우 정수형 변수에 +1 적용
 */
