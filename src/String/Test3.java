package String;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        String longWord = "";

        for(String word : words) {
            if(word.length() > longWord.length()) {
                longWord = word;
            }
        }
        System.out.println(longWord);
        scanner.close();
    }

}