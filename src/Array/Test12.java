package Array;
import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int student = scanner.nextInt();
        int test = scanner.nextInt();

        int[][] arr = new int[test][student];

        for (int i = 0; i < test; i++) {
            for (int j = 0; j < student; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int answer = 0;

        for(int i = 1; i <= student; i++) {
            for (int j = 1; j <= student; j++) {
                int count = 0;
                for (int k = 0; k < test; k++) {
                    int mentor = 0;
                    int mentee = 0;
                    for (int l = 0; l < student; l++) {
                        if (arr[k][l] == i) mentor = l;
                        if (arr[k][l] == j) mentee = l;
                    }
                    if (mentor < mentee) count++;
                }
                if (count == test) answer++;
            }
        }

        System.out.println(answer);
    }
}

/*
4 3
3 4 1 2
4 3 2 1
3 1 4 2
 */

