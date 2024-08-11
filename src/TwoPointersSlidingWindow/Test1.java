package TwoPointersSlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        for(int i = 0 ; i < size1 ; i++) {
            array1[i] = scanner.nextInt();
        }

        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        for(int i = 0 ; i < size2 ; i++) {
            array2[i] = scanner.nextInt();
        }

        ArrayList<Integer> ArrList = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (p1 < size1 && p2 < size2) {
            if(array1[p1] < array2[p2]) ArrList.add(array1[p1++]);
            else ArrList.add(array2[p2++]);
        }
        while (p1 < size1) ArrList.add(array1[p1++]);
        while (p2 < size2) ArrList.add(array2[p2++]);

        for(int i : ArrList) System.out.print(i + " ");
    }
}


/*
3
1 3 5
5
2 3 6 7 9
 */

