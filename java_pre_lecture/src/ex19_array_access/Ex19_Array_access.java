package ex19_array_access;

import java.util.Scanner;

public class Ex19_Array_access {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] intArray = new int[5];
		int max = 0;
		System.out.println("���� ���� 5���� �Է��ϼ���.");
		
		for(int i = 0; i < 5; i++) {
			intArray[i] = scanner.nextInt();
			
			if(intArray[i] > max) {
				max = intArray[i];
			}
			
			if(intArray[i] < 0) {
				i--;
			}
		}
		
		System.out.println("�Է��� �� �� �ִ밪 : " + max);
		
		scanner.close();
	}
}