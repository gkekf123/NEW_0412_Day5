package day05;

import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {

			//입력받은 정수가 소수인지 아니니지 For문으로 판별
			//소수의 특징으 ㄴ약수의 개수가 2개다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 > ");
		int num = sc.nextInt();
		int count = 0;	//합계변수
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				count ++;
			}
		}
		System.out.println(count == 2 ? num + "은 소수" : num + "은 소수가 아님");
		
		
		
	}

}
