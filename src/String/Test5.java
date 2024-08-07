package String;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(solution(input));
    }

    public static String solution(String input) {
        String result = null;
        char[] st = input.toCharArray();

        int lt = 0;
        int rt = st.length - 1;

        while(lt < rt) {
            if(!Character.isAlphabetic(st[lt])) {
                lt++;
            } else if(!Character.isAlphabetic(st[rt])) {
                rt++;
            } else {
                char tmp = st[lt];
                st[lt] = st[rt];
                st[rt] = tmp;
                lt++;
                rt--;
            }

            result = String.valueOf(st);

            return result;
        }
        return result;
    }
}
