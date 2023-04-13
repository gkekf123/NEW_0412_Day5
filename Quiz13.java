package day05;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {

		// 7에서 100까지 정수 중에 7의 배수만 가로로 출력
		for(int i = 7; i <= 100; i++) {	//i+=7
			if(i % 7 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();	// 줄바꿈
		
		
		System.out.println("=======================================");
		// 1부터 200까지 정수 중에 9의 배수의 개수를 출력
		int count = 0;	//합계
		for(int i = 1; i <= 200; i ++) {
			if(i % 9 == 0) {
				
				count += 1;		// 1씩 증가
			}
		}
		System.out.println("9의 배수 개수 : " + count);
		
		
		System.out.println("=======================================");
		// 100부터 50 사이 두 수 사이의 합
		int sum = 0;
		for(int i = 50; i <= 100; i++) {
			sum += i;
		}
		System.out.println("50부터 100까지 두 수사이의 합 : " + sum);
		
		
		System.out.println("=======================================");
		//1. A부터Z까지 가로로 붙여서 출력, A=65, Z=90
		for(int i = 65; i <=90; i++ ) {
			System.out.print((char)(i));
		}
		System.out.println();
		
		//2. A부터Z까지 가로로 붙여서 출력, A=65, Z=90
		for(char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c);
		}
		
		//3. A부터Z까지 가로로 붙여서 출력, A=65, Z=90
		String str = "";
		for(char c = 'A'; c <= 'Z'; c++) {
			str +=c ;
		}
		System.out.println();
		System.out.println(str);
		
		
		System.out.println("=======================================");
		//1. 입력받은 정수까지 책토리얼 5팩토리얼 = 5 * 4 * 3 * 2 * 1
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 > ");
		int num = sc.nextInt();
		
		int fa = 1;
		
		for(int i = num; i >= 1; i--) {
			fa *= i;
			
		}
		System.out.println(num + "! = " + fa);
		
		//2.  입력받은 정수까지 책토리얼 5팩토리얼 = 5 * 4 * 3 * 2 * 1
		Scanner scan = new Scanner(System.in);
		System.out.println(">");
		int num2 = 1;
		for(int i = 1; i <= num2; i++) {
			num2 *= i;
		}
		System.out.println(num + "!은" + num2);
	}

}
