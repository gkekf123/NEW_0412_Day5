package day05;

public class Quiz12 {

	public static void main(String[] args) {

		/* 
		 * 1. 1000까지 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수의 count(개수)
		 * 2. 50 ~ 100까지의 합
		 */
		int i =1;
		int count = 0;
		
		while(i <= 1000) {
			if(i % 4 == 0 && i % 8 != 0) {
				count += 1;
			}
				i++;
		}
		System.out.println(count);
		
		
		//50 ~ 100까지의 합
		int a = 50;
		int num = 0;
		
		while(a <= 100) {
			num += a;
			a++;
		}
		System.out.println("50부터 100까지의 합 : " + num);
	}

}
