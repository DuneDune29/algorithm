package String;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String LowInput = input.toLowerCase();
        System.out.println(solution(LowInput));
    }

    public static String solution(String input) {
        String result = "";
        String input_r = "";
        char[] words = input.toCharArray();

        for(char ch : words) {
            input_r = ch + input_r;
        }

        if(input.equals(input_r)) {
            result = "YES";
        } else {
            result = "NO";
        }
        return result;
    }
}
