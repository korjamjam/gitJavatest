package h.inherit.ex2;

//Product를 상속받는 TV클래스 작성
// 필드에는 int inch정보를 가지고 있고 information을 오버라이딩하여 기본 product의 정보+icnh 정보 출력
public class TV extends Product{
	private int inch;

	public TV() {
		super();
	}

	public TV( String brand, String pCode, String pName, int price ,int inch) {
		super(brand, pCode, pName, price);
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	
	
	@Override
	public String toString() {
		return "TV [inch=" + inch + "]";
	}

	public String information() {
		return super.information() + " 티비인치 : " + this.inch + "인치";
	}


}
