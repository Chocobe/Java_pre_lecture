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
			System.out.println("������ �Է��ϼ��� : ");
			cur_val = scanner.nextInt();
			cnt++;
			sum += cur_val;
			avg = (double)sum / (double)cnt;
			
			System.out.println("�Է°��� ���� : " + cnt);
			System.out.println("�Է°��� ���� : " + sum);
			System.out.println("�Է°��� ��� : " + avg);
			
			if(cur_val == -1) {
				break;
			}
		}
		
		System.out.println("����");
		
		scanner.close();
	}
}
