package ex18_break_example;

import java.util.Scanner;

public class Ex18_break_example {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		
		while(true) {
			System.out.println(">>");
			String text = scanner.nextLine();
			
			if(text.equals("exit")) {
				break;
			}
		}
		
		System.out.println("������ϴ�.");
		scanner.close();
	}
}
