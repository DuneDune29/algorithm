package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        String str = scanner.next();

        String[] result = solution(first, str);

        for (String s : result) {
            System.out.print(s);
        }

    }
    public static String[] solution(int first, String str) {

        String[] answer = new String[first];
        List<String> list = new ArrayList<>();
        char[] temp = new char[7];
        StringBuilder tempSb = new StringBuilder(7);

        for(char chs : str.toCharArray()){

            if(chs == '#'){
//                temp[i] = 1;
                tempSb.append("1");
            } else {
//                temp[i] = 0;
                tempSb.append("0");
            }

            if(tempSb.length() == 7){
                int temp10 = Integer.parseInt(String.valueOf(tempSb), 2);
                list.add(String.valueOf((char) temp10));
                tempSb.setLength(0);
            }
        }

        answer = list.toArray(answer);

        return answer;
    }
}


/*
 *
 * #****###**#####**#####**##**
 */

