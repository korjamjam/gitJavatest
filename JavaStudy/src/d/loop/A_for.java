package d.loop;

import java.util.Scanner;

public class A_for {
	/*
	 * <반복문>
	 * 프로그램 흐름을 제어하는 제어문 중 하나
	 * 어떤 실행코드를 반복적으로 수행시켜준다.
	 * 
	 * 크게 두 종류로 나뉨(for / while(do-while))
	 * 
	 * *for문
	 * 
	 * for(초기식; 조건식; 증감식){ //반복횟수를 지정하기 위해서 제시하는 것들
	 *    반복적으로 실행시키고자하는 코드더미
	 * }
	 * 
	 * - 초기식 : 반복문이 수행될 때 "처음에 단 한번만 실행하는 구문"
	 *          (반복문 안에서 사용 될 변수를 선언 및 초기화하는 작업)
	 * - 조건식 : "반복문이 수행될 조건" 
	 *          조건식이 true일 경우 해당 반복을 실행
	 *          조건식이 false가 되는 순간 반복문을 탈출
	 *          (초기식에서 제시된 변수를 가지고 조건식을 정함)
	 * - 증감식 : 반복문을 제어하는 변수 값을 증감시키는 구문
	 * 			(보통 초기식에 제시된 변수를 가지고 증감을 시킴)
	 * 
	 * tip
	 * for문 안에 초기식, 조건식, 증감식 각각 생략 가능하다(단, 생략해서 쓰는 경우가 없다 -> while사용)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		//10번 반복하는 반복
//		for(int i = 0; i < 10; i++) {
//			System.out.println("안녕하세요"+i);
//		}
//		//1~5
//		for(int i = 1; i <= 5; i++) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		//5~1
//		for(int i = 5; i >= 1; i--) {
//			System.out.print(i+" ");
//		}
		//정수 n을 입력받아 1부터 n까지 1씩 증가시키면서 출력해라
		//정수입력 : 6
		//123456
		
//		int num;
//		System.out.print("정수 입력 :");
//		num = sc.nextInt();
//		sc.nextLine();
//		
//		for(int i=0; i<=num; i++) {
//			System.out.print(i+" ");
//		}
		//1~10 숫자 중 홀수만 출력
		
		/*for(int i = 1; i <=10; i++) {
			if(i % 2 == 1) {
				System.out.print("홀수 :" + i+" ");
			}
		}*/
		//1부터 100까지의 총 합을 구해라
		
//		int sum = 0;
//		for(int i = 1; i<=100; i++) {
//			sum += i;	
//		}
//		System.out.println(sum);
		
		//정수 n을 입력 받아 1부터 n까지 1씩 증가하여 모든 수를 더해서 출력해라
		//정수입력 : 5
		// 1부터 5까지의 합 :15
		
		/*int num;
		int sum = 0;
		System.out.print("정수 입력 :");
		num = sc.nextInt();
		
		for(int i=1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1부터 " + num + "까지의 합: " + sum);
		*/
		
		/*
		 * java.lang.Math 클래스에서 제공하는 random()메소드 호출하면 매번 다른 랜덤값을 받을 수 있다. 
		 * 
		 * Math.random() 호출시 -> 0.0 ~ 0.9999999999999999
		 * 실수중에 랜덤값이 나온다.
		 * 0 <= ~ < 1.0
		 * 
		 * int num = Math.random() // double형이라서 int로 랜덤값을 받을 수 없다
		 * 
		 * int num = (int)(Math.random() * 10)-> 0 ~ 9
		 * 
		 * int num = (int)(Math.random() * 10) + 1 -> 1 ~ 10
		 * 
		 * int num = (int)(Math.random() * (최대값+1) - 최소값) + 최소값
		 * //공식이니 외울것
		 * 
		 */
		//random(1~10)한 숫자를 n을 생성해서 1부터 n까지 모두 더한 값을 출력하기
		//random 수 : 5
		//1~5까지의 합.
		
//		int num = (int)(Math.random() * 10) + 1;
//		int sum = 0;
//		System.out.println("random 수 :" + num);
//		for(int i = 0; i <=num; i++) {
//			sum += i;
//		}
//		System.out.print("1~" + num+"까지의 합 :" + sum);
		
		//random(5~50)까지 하나의 숫자 n을 생성해서 1부터 n까지의 숫자중 짝수만 출력해라(50포함)
		
//		int num = 0;
//		num = (int)(Math.random() * 46) + 5;
//		
//		System.out.println("random 수 : " + num);
//		for(int i = 1; i <= num; i++ )
//		{
//			if(i % 2 ==0) {
//				System.out.print(i+ " ");
//			}
//		}
		/*각 인덱스별 문자 출력
		H -> str.charAt(0);
		E -> str.charAt(1);
		L -> str.charAt(2);
	    L -> str.charAt(3);
		O -> str.charAt(4);
		문자열.length() : 문자열의 길이를 구하는 방법
		*/
//		String str = "Hello";
//		
//		System.out.println(str.length());
//		for(int i = 0; i< str.length(); i++)
//		{
//			System.out.println(str.charAt(i));
//		}
		//사용자에게 문자열을 입력받아 해당 문자열의 짝수자리 글자만 출력
		//문자열 입력 : hello
		//el
		
//		String str;
//		System.out.print("문자열 입력 :");
//		str = sc.next();
//		
//		for(int i = 0; i < str.length(); i++) {
//			if(i % 2 == 1/*i % 2 != 0*/) {
//				System.out.print(str.charAt(i) + " ");
//			}
//		}
//		
		
		//구구단 2단 출력
//		System.out.println("구구단 2단");
//		for(int j = 1; j <=9; j++) {
//			int i = 2;
//			System.out.println(i + " * " + j + " = " + i*j);
//		}
//		
//		
		/*
		 * 2 * 1 =2 
		 * 2 * 2 =4
		 * 2 * 3 =6
		 * ...
		 * 2 * 1 =2
		 * 2 * 1 =2
		 * 
		 * 3 * 1 =2 
		 * 3 * 2 =4
		 * 3 * 3 =6
		 * ...
		 * 3 * 8 =2
		 * 3 * 1 =2
		 * 
		 */
		System.out.println("구구단");
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <=9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println("");
		}
		
		sc.close();
	}
}
