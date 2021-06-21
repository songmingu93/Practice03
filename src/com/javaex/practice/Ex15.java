package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		int inputNum;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		inputNum = sc.nextInt(); // 사용자가 입력한 값
		
		
		for(int i=1; i<=inputNum; i++) {
			if(inputNum%i == 1) {    // 사용자가 입력한 값에서 i=1을 나누었을 때 다 떨어지므로 나머지는 없음 == 0
			
				System.out.println(i);
			}
		}

		sc.close();

	}

}