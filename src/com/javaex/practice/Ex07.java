package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++){
			for(int j=1; j<=i; j++){  // for문을 2번써서 가로 세로 길이를 둘다 늘린다.
				System.out.print(i);
			}
			System.out.println("");
		}
		
		
		sc.close();
	}

}
