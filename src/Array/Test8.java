package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        for(int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int[] arrayTemp = new int[size];
        Arrays.fill(arrayTemp,1);

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(array[i] < array[j]) {
                    arrayTemp[i]++;
                }
            }
        }

        for(int i : arrayTemp) {
            System.out.print(i + " ");
        }
    }
}

/*
 * 5
 * 87 89 92 100 76
 * 템프배열 5개 값 1로 초기화
 * 첫번째 값을 하나씩 순서대로 비교해서 등수 매기기
 * 첫번째 값이 다음값보다 작을경우 +1씩 적용
 * 두번째 값이 다음값보다 작을경우 +1씩 적용
 */
