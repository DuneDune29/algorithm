package String;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        char ch = scanner.next().charAt(0);

        int result = solution(str, ch);

        System.out.print(result);
    }
    public static int solution(String str, char ch) {

        int answer = 0;

        str = str.toLowerCase();
        ch = Character.toLowerCase(ch);

        for(char c : str.toCharArray()){
            if(c == ch) {
                answer++;
            }
        }

        return answer;
    }
}

/*
 *  Computercooler
 *  c
 *
 * tttccttccTT
 * T
 */

