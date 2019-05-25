package ex18_break_example;

import java.util.Scanner;

public class Ex18_break_example {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit를 입력하면 종료합니다.");
		
		while(true) {
			System.out.println(">>");
			String text = scanner.nextLine();
			
			if(text.equals("exit")) {
				break;
			}
		}
		
		System.out.println("종료헙니다.");
		scanner.close();
	}
}
