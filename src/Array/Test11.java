package Array;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[][] array = new int[size][5];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        int totalStudent = 0;

        for (int i = 0; i < size; i++) {
            int cnt = 0;
            for (int j = 0; j < size; j++) {
                if (i == j) continue;
                else {
                    for (int k = 0; k < 5; k++) {
                        if (array[i][k] == array[j][k]) {
                            cnt++;
                            break;
                        }
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                totalStudent = i + 1;
            }
        }
        System.out.println(totalStudent);
    }
}

