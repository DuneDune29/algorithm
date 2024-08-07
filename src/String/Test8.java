package String;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String answer = "NO";
        input = input.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(input).reverse().toString();
        if (input.equals(tmp)) {
            answer = "YES";
            System.out.println(answer);
        } else {
            System.out.println(answer);
        }

    }
}