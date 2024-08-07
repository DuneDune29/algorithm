package String;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        String result = solution(str);

        System.out.println(result);
    }
    public static String solution(String str) {

        char p = str.charAt(0);

        String answer = Character.toString(str.charAt(0));

        int s = 1;

        for(int i=1; i<str.length(); i++) {

            if(p == str.charAt(i)) {
                s++;
            } else {
                answer += Integer.toString(s);
                answer += Character.toString(str.charAt(i));
                s = 1;
                p = str.charAt(i);
            }
        }

        answer = answer.replace("1", "");

        return answer;
    }
}

/*
 * 입력받은 문자열을 파라미터로 solution메소드 호출
 *
 * 문자열을 charAt()함수를 이용하여 하나씩 앞자리와 같은지 비교
 * 같으면 +1 해서 변수에 담기
 *
 * 문자열에서 정수1을 제거
 *
 * 담긴 배열 리턴
 *
 * KKHSSSSSSSE
 */

