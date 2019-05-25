package ex19_array_access;

import java.util.Scanner;

public class Ex19_Array_access {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] intArray = new int[5];
		int max = 0;
		System.out.println("양의 정수 5개를 입력하세요.");
		
		for(int i = 0; i < 5; i++) {
			intArray[i] = scanner.nextInt();
			
			if(intArray[i] > max) {
				max = intArray[i];
			}
			
			if(intArray[i] < 0) {
				i--;
			}
		}
		
		System.out.println("입력한 값 중 최대값 : " + max);
		
		scanner.close();
	}
}