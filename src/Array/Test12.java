package Array;
import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size1 = scanner.nextInt();
        int size2 = scanner.nextInt();

        int[][] arr = new int[size1][size2];

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                arr[i][j] = scanner.nextInt();

            }
        }
        System.out.println();
    }
}

