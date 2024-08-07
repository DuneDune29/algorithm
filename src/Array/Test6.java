package Array;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];
        int[] arrayTemp = null;

        for(int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        for(int i = 0; i < size; i++) {
            int n = 0;
            while (array[i] != 0){
                n = n * 10 + array[i] % 10;
                array[i] /= 10;
            }
            array[i] = n;

            if(isPrime(array[i])) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        } else {
            for(int i = 2; i < n; i++) {
                if(n % i == 0) return false;
            }
            return true;
        }
    }
}

/*
 * 9
 * 32 55 62 20 250 370 200 30 100
 */
