package ex17_continue_example;

import java.util.Scanner;

public class Ex17_continue_example {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 5개를 입력하세요");
		
		int sum = 0;
		
		for(int i = 0 ; i < 5; i++) {
			int n = scanner.nextInt();
			
			if(n < 0) {
				continue;
				
			} else {
				sum += n;
			}
		}
		System.out.println("입력한 양의 정수의 합 : " + sum);
		scanner.close();
	}
}