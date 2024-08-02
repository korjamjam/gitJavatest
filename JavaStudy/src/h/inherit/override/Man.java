package h.inherit.override;

public class Man {
	private String name;
	
	public Man() {
		super();
	}

	public Man(String name) {
		super();
		this.name = name;
	}

	public void tellYourName() {
		System.out.println("My name is " + this.name);
	}

	@Override
	public String toString() {
		return "이름 : "+ name;
	}

}
