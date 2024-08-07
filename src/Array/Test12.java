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

        for(int i = 1; i <= student; i++) {
            for (int j = 1; j <= student; j++) {
                int n = 0;
                for (int k = 0; k < test; k++) {
                    int mentor = 0;
                    int mentee = 0;
                    for (int l = 0; l < student; l++) {
                        if (arr[k][l] == i) mentor = l;
                        if (arr[k][l] == j) mentee = l;
                    }
                }
            }
        }

        System.out.println();
    }
}

