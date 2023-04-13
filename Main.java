package day05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  // 테스트 케이스 개수 입력 받기

        int i = 1;
        while (i <= t) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Case #" + i + ": " + (a + b));
            i++;
        }

        scanner.close();
        
        
    }
}
