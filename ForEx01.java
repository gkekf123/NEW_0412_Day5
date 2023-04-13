package day05;

public class ForEx01 {

	public static void main(String[] args) {

		int sum = 0;	//합계변수
		
		for(int a = 1; a<=10; a++) {
			System.out.println(a);
			sum += a;
		}
		System.out.println("1부터 10까지의 합계 : " + sum);
		
			System.out.println("================================================");
		// 역순으로 10, 9, 8...
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		
		
		
		
	}

}
