package String;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		char ch = scanner.next().charAt(0);
		
		for(int result : solution(str, ch)) {
			System.out.print(result + " ");
		}
		
	}
	
	public static int[] solution(String str, char ch) {
		
		int[] answer = new int[str.length()];
		
		int p = 1000;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ch) {
				p = 0;
				answer[i] = p;
			} else {
				p++;
				answer[i] = p;
			}
		}
		
		p = 1000;
		
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i) == ch) {
				p = 0;
			} else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		
		return answer;
	}

}

/*
 * input에 문자열하나 문자하나 담기
 * 
 * 왼쪽 첫문자부터 for문으로 문자하나씩 input에 있는 문자랑 같은지 비교
 * 같으면 해당 배열 위치에 0 담기, 다르면 +1해서 담기
 * 
 * 오른쪽 첫문자부터 for문으로 문자하나씩 input에 있는 문자랑 같은지 비교
 * 같으면 그대로, 다르면 먼저 담긴배열위치의 숫자랑 비교해서 작은값 담기
 * 
 * 담긴 배열 리턴
 * 
 * teachermode e
 * 10121012210 
 */
	
