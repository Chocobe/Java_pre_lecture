// JAVA 선행수업 2번째 시간

package ex001;

import java.util.Scanner;

public class ArithmaticOperator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수(초)를 입력하세요 : " );
		
		int time = scanner.nextInt();
		int second = time % 60;
		int minute = (time / 60) % 60;
		int hour = (time / 60) / 60;
		
		System.out.print(time + "초는 ");
		System.out.print(hour + "시간, ");
		System.out.print(minute + "분, ");
		System.out.println(second + "초입니다.");
		
		scanner.close();
	}
}
