package test.t240715.object1;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {			
		Scanner sc = new Scanner(System.in);
//		
//		//정수 num1, num2, num3를 입력받아 홀짝을 출력하라
//		//입력 : 6 4 7
//		//짝 짝 홀
//		int num1, num2, num3;
//		
//		System.out.print("정수 입력 : ");
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		num3 = sc.nextInt();
//		
//		System.out.print(num1 %2 == 0 ? "짝 " : "홀 ");
//		System.out.print(num2 %2 == 0 ? "짝 " : "홀 ");
//		System.out.print(num3 %2 == 0 ? "짝 " : "홀 ");
//		System.out.println();
//		System.out.println("========================================");
//		
//		//정수(0~100)을 입력받아 0부터 입력받은 수까지 입력.
//		//입력 : 7
//		//0 1 2 3 4 5 6 7
//		int num4;
//		System.out.print("정수 입력 : ");
//		num4 = sc.nextInt();
//		sc.nextLine();
//		
//		if(num4 > 0 && num4 <=100) {
//			for(int i = 0; i <= num4; i++) {
//				System.out.print(i + " ");
//			}
//		}
//		else {
//			System.out.println("0부터 100까지 수가 아닙니다.");
//		}
//		System.out.println("========================================");
//		//번호를 입력한 횟수를 구하는 프로그램을 
//		//번호(1~20)까지를 무작위로 10번 입력받는다.
//		//입력받은 1~20까지의 수가 각각 몇번 입력되었는지를 출력한다.
//		//입력 : 1 5 7 10 15 5 1 7 7 2
//		//입력횟수 : 2 1 0 0 2 0 3 0 0 1 0 0 0 0 1 0 0 0 0 0 
//		        int[] arr = new int[10];
//		        int[] count = new int[20]; // 1~20까지의 입력 횟수를 저장할 배열
//
//		        System.out.print("입력 : ");
//		        for (int i = 0; i < arr.length; i++) {
//		            arr[i] = (int)(Math.random() * 20 + 1); // 1~20까지의 무작위 수 생성
//		            System.out.print(arr[i] + " ");
//		        }
//		        
//		        System.out.println();
//
//		        // 입력된 숫자의 횟수를 카운트
//		        for (int i = 0; i < arr.length; i++) {
//		            count[arr[i] - 1]++;
//		        }
//
//		        System.out.print("입력 횟수 : ");
//		        for (int i = 0; i < count.length; i++) {
//		            System.out.print(count[i] + " ");
//		        }
//		        System.out.println();
//		        
//		        /*
//		         int[] arr = new int[20]
//		         
//		         System.out.print("입력 : ");
//		         for(int i=0; i< 10; i++{
//		         	int num = sc.nextInt();
//		         	arr[num -1]++;
// 		         */
//		        
//		System.out.println("========================================");
		
		//학생성적관리 프로그램을 만들고자 한다.
		//학생 클래스를 정의해보자. Student class는 name(String), classRoom(int)
		//javaScore(double), sqlScore(double), practiceScore(double)값을 가진다.
		//각 필드데이터의 getter/setter, 기본생성자, 모든필드데이터를 초기화하는 생성자를 작성하고
		//또한 toString : 학생의 정보를 "xx반 xxx학생 xx점 xx점 xx점"으로 정보를 반환하는 메소드 
		//각점수는 자바, sql, practice순으로 작성
		// isPassed: 모든 점수가 60점이상이면서 평균이 60점이상이면 true 아니면 false를 반환하는 메소드
		// reTest : 학생의 모든 점수를 랜덤(0~100)으로 다시 부여하는 메소드 반환 없음.
		
		//학생 10명을 생성하고 reTest를 실행한 후 모든 학생의 점수를 출력하라
		
		/*
		 * String name; int classroom; double javaScore, sqlScore, practiceScore;
		 * Student[] st = new Student[10];
		 * 
		 * for(int i=0; i<st.length; i++) { System.out.print("이름 : "); name =
		 * sc.nextLine();
		 * 
		 * System.out.print("반 : "); classroom =
		 * sc.nextInt();//(st.setName(sc.nextInt())) sc.nextLine();
		 * 
		 * System.out.print("자바점수 : "); javaScore = sc.nextDouble(); sc.nextLine();
		 * 
		 * System.out.print("SQL점수 : "); sqlScore = sc.nextDouble(); sc.nextLine();
		 * 
		 * System.out.print("연습점수 : "); practiceScore = sc.nextDouble(); sc.nextLine();
		 * 
		 * st[i] = new Student(name, classroom, javaScore, sqlScore, practiceScore);
		 * st[i].toString(); st[i].isPassed(); st[i].reTest(); }
		 */
		Student[] stArr = new Student[10];
		
		for(int i = 0; i < stArr.length; i++) {
			stArr[i] = new Student();
			System.out.print("이름 : " );
		}
		
			
		System.out.printf("%5s %3s %4s %4s %4s \n", "이름", "반", "자바", "sql","실습");
		for(int i = 0; i<stArr.length; i++) {
			Student st = stArr[i];
			System.out.printf("5s %3d %4.2f %4.2f %4.2f\n",st.getName(), st.getClassRoom(), st.getJavaScore(), st.getSqlScore(), st.getPracticeScore());
		}
		sc.close();
		
		
	}

}
