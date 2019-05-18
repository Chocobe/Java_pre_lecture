package ex013;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		
		int sum = 0;
		int cnt = 0;
		double avg = 0;
		int cur_val = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("정수를 입력하세요 : ");
			cur_val = scanner.nextInt();
			cnt++;
			sum += cur_val;
			avg = (double)sum / (double)cnt;
			
			System.out.println("입력값의 개수 : " + cnt);
			System.out.println("입력값의 총합 : " + sum);
			System.out.println("입력값의 평균 : " + avg);
			
			if(cur_val == -1) {
				break;
			}
		}
		
		System.out.println("종료");
		
		scanner.close();
	}
}
