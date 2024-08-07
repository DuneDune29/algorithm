package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList answer = new ArrayList<>();
        String[] str = new String[n];

        for(int i=0; i<str.length; i++){
            str[i] = scanner.next();
        }

        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        for(int i=0; i<answer.size(); i++) {
            System.out.println(answer.get(i));
        }

    }

}
