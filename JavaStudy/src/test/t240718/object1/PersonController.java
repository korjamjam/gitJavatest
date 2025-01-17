package test.t240718.object1;

public class PersonController {
	
	Person[] p = new Person[20];
//	private Student[] s = new Student[3];  //데이터값 n,n,n
//	private Employee[] e = new Employee[10];//데이터값 n,n,n,n,n,n,n,n,n,n
	
	//학생객체 수를 countArr[0]에
	//근로자객체 수를 countArr[1]에 넣어서 변환
	
	public int[] personCount() {
		int[] countArr = new int[2];
		
		int studentCount = 0, employeeCount = 0;
		for(Person per : p) {
			if(per == null) {
				break;
			}
			else if(per instanceof Student) {
				studentCount++;
			}
			else if(per instanceof Employee) {
				employeeCount++;
			}
		}
		countArr[0] = studentCount;
		countArr[1] = employeeCount;
		
		return countArr;
	}
	

	public void insertPerson(Person per){
		for(int i=0; i<p.length; i++) {
			if(p[i] == null) {
				p[i] = per;
				return;
			}
		}

	}
		
	public Person[] printPerson() {
		return this.p;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for (int i = 0; i < p.length; i++) {
			if (p[i] == null) {
				p[i] = new Student(name, age, height, weight, grade, major);
				return;
			}
		}
	}	
	
	public Student[] printStudent() {
		return null;
	}
	
	
	public void insertEmployee(String name, int age, double height, double weight, int grade, String major) {
		for (int i = 0; i < p.length; i++) {
			if (p[i] == null) {
				p[i] = new Student(name, age, height, weight, grade, major);
				return;
			}
		}
	}

	public Employee[] printEmployee() {
		return null;
	}

}
