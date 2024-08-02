package test.t240704;

public class T_09 {
	/*
	 * 4행 4열짜리 정수형 배열을 선언 및 할당하고
	 * 1) 1~16까지 값을 차례대로 저장하세요
	 * 2)저장된 값들을 차례대로 출력하세요.
	 * 
	 * ex.
	 *  1  2  3  4
	 *  5  6  7  8
	 *  9  10 11 12
	 *  13 14 15 16
	 */

	public static void main(String[] args) {

		int[][] arr = new int[4][4];

		int num = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = num; // arr[i][j] = num++;도 가능
				num++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				arr[i][j] = num; // arr[i][j] = num++;도 가능
//				num++;
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}
// 한번에 쓸수 있지만 나중에 개발을 할 때는 기능과 출력을 따로 만들어 놓으면 편하다.
	}
}
