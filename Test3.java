package day05;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		/* 
		 * 1. 가로, 세로 길이를 입력을 받습니다.
		 * 2. 가로, 세로 길이만큼 사각형을 출력합니다
		 * 3. 단 윤곽만 나오면 됩니다
		 * 	*****
		 *	*   *
		 *	*   *
		 *	*****
		 */
		
	Scanner scan = new Scanner(System.in);
		
		System.out.print("가로 길이 입력 > ");
		int x = scan.nextInt();
		System.out.print("세로 길이 입력 > ");
		int y = scan.nextInt();

		for(int i = 1; i <= y; i++) {
			for(int j = 1; j <= x; j++)	{
				if(i == 2 || i == y - 1 || j == 2 || j == x - 1) {
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
