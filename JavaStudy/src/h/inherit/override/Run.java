package h.inherit.override;

public class Run {
	/*
	 * 참조변수를 호출하면 자동으로 .toString()호출된다.
	 * 
	 * 오버라이딩 전 : Object 클래스의 toString() 실행 -> 풀클래스명 + @ + 객체의 주소를 암호와한 16진수값
	 * 오버라이딩 후 : Man클래스(자식클래스)의 toString()를 실행 ->해당 객체가 가지고 있는 모든 필드의 값을 한 문자열로 반환 
	 */

	public static void main(String[] args) {
		Man m = new Man("전제민");
		Object str = new String("안녕");
		System.out.println(m);
		System.out.println(str.toString());
		//객체가 생성되어있다면 객체정보를 보기위해서 참조변수를 출력하는 순간 무조건 toString메소드가 호출된다.
		//참조변수에 객체의 주소가 없고 null이라면 null을 표시
	}

}
