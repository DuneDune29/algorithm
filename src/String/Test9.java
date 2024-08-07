package String;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		char[] chs = input.toCharArray();
		
		StringBuilder tmp = new StringBuilder();
		
		for(char ch : chs) {
			
			if(Character.isDigit(ch)) {
				tmp.append(ch);
			}
		}
		
		int result = Integer.parseInt(tmp.toString());
		
		System.out.println(result);
		
	}

}

/*
	input에 문자열 담기
	문자 하나씩 반복문 적용
	숫자를 판별하는 함수 적용
	숫자만 골라서 Stringbuilder에 붙이기
	문자열을 자연수로 변환하기
	변환한 자연수 출력하기
*/