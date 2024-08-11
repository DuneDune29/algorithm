package TwoPointersSlidingWindow;

import java.util.*;

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

        Arrays.sort(array1);
        Arrays.sort(array2);

        ArrayList<Integer> arrList = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (p1 < size1 && p2 < size2) {
            if(array1[p1] < array2[p2]) {
                p1++;
            } else if (array1[p1] == array2[p2]) {
                arrList.add(array1[p1]);
                p1++;
                p2++;
            } else {
                p2++;
            }
        }
        for (int i : arrList) {
            System.out.print(i + " ");
        }

//        ArrayList<Integer> distinctArrayList = new ArrayList<>();
//
//        for(int i = 0; i < size1; i++){
//            for(int j = 0; j < size2; j++){
//                if(array1[i] == array2[j]) {
//                    distinctArrayList.add(array1[i]);
//                    break;
//                }
//            }
//        }
//        Collections.sort(distinctArrayList);
//
//        for(int i : distinctArrayList) {
//            System.out.print(i + " ");
//        }
    }
}


/*
5
1 3 9 5 2
5
3 2 5 7 8
 */

