package day05;

import java.util.Scanner;

public class MultoForEx02 {

	public static void main(String[] args) {

		
		/* 
		 * 회전수가 변경되는 중첩 반복문
		 * i 값에 따라서 j의 값을 변경
		 * 예시
		 * 1-1
		 * 2-1
		 * 2-2
		 * 3-1
		 * 3-2
		 * 3-3
		 * 
		 */
		
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.println(i + "-" + j);
			}
			System.out.println("===========================");
		}
		/* 
		 * 별찍기
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 */
		//행
		for(int i=1; i<=5; i++) {
			//출력
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/* 
		 *    *
		 *   ***
		 *  *****
		 *  
		 */
		System.out.println("====================================");
		for(int i=1; i<=5; i++) {
			//공백
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			//별 출력
			for(int j=1; j<=2*i -1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("====================================");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 > ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("====================================");
		
		/* 
		 * 1. 가로, 세로 길이를 입력을 받습니다.
		 * 2. 가로, 세로 길이만큼 사각형을 출력합니다
		 * 3. 단 윤곽만 나오면 됩니다
		 * 	*****
		 *	*   *
		 *	*   *
		 *	*****
		 */
		
		// 방법1
		Scanner scan = new Scanner(System.in);
		
		System.out.print("가로 길이 입력 > ");
		int x = scan.nextInt();
		System.out.print("세로 길이 입력 > ");
		int y = scan.nextInt();
		
		for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (i == 0 || i == y - 1 || j == 0 || j == x - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
		sc.close();
		
		// 방법2
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("가로 길이 입력 > ");
		int w = scanner.nextInt();
		System.out.print("세로 길이 입력 > ");
		int h = scanner.nextInt();
		
		// 행
		for(int i = 1; i <= h; i++) {
			for(int j = 1; j <= h; j++) {
				if(i == 1 || i == h) {	// 첫행, 마지막행
					System.out.print("*");						
				}else {	//첫행, 마지막행이 아닌경우
					if(j == 1 || j == w) {	//첫열, 마지막열
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				
			}
			System.out.println();

		}
		sc.close();
		System.out.println("====================================");
		
	}

}
