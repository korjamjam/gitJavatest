package test.t240703;

import java.util.Scanner;
/*
 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지 숫자들을 모두 출력하세요.
 * 단, 입력한 수는 1보다 크거나 같아야 합니다
 * 1 미만의 숫자가 입력됐다면
 * "1 이상의 숫자를 입력해주세요"가 출력되면서 다시 사용자가 값을 입력하도록 하세요
 */

public class T_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 :");
			int num = sc.nextInt();
			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			} 
			else {
				System.out.println("1이상의 숫자를 입력하세요");
				continue;
			}
		}
	}
}
