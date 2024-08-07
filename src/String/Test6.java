package String;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(solution(input));
    }

    public static String solution(String input) {
        char[] words = input.toCharArray();
        String result = "";

        for(char ch : words) {
            if(!result.contains(String.valueOf(ch))) {
                result += String.valueOf(ch);
            }
        }
        return result;
    }
}
