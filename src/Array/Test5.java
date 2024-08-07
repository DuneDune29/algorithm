package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.print(primeCheck(n));
    }

    public static int primeCheck(int n) {

        int cnt = 0;
        boolean[] isPrime = new boolean[n + 1];

        Arrays.fill(isPrime,true);

        isPrime[0] = isPrime[1] = false;

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(isPrime[i]) {
                for(int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for(boolean bool : isPrime) {
            if(bool == true) {
                cnt++;
            }
        }

        return cnt;
    }
}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//
//        System.out.println(isPrime(n) ? "Prime" : "Not prime");
//
//    }
//
//    public static boolean isPrime(int n) {
//        if(n < 2) {
//            return false;
//        } else {
//            for(int i = 2; i < n; i++) {
//                if(n % i == 0) return false;
//            }
//            return true;
//        }
//    }

/*
 * 일반적인 소수 판별법
 * 시간복잡도 O(N)이며, N개의 수를 판별하면 O(N^2)이 된다.
 * 시간이 오래걸려 타임아웃 에러 나올수 있다.
 */
