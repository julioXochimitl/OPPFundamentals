package fundamentals;

public class Student {
	
	String firstName;
	String lastName;
	int registration;
	int grade;
	int year;
	
	public static void main(String[] args) {
		
		Student student1 = new Student("", "", 0, 60,2016);
		
		student1.printFullName("Julio", "Xochimitl");
		student1.isApproved(60);
		System.out.println(student1.changeYearIfApproved());
	
	}
	
	public void printFullName(String name, String lastName) {
		this.firstName = name;
		this.lastName = lastName;
		System.out.println(firstName + " " + lastName);
	}
	
	public void isApproved(int regist) {
		this.registration = regist;
		if(registration >= 60) {
			System.out.println(registration >= 60);
		}else {
			System.out.println(false);
		}
	}
	
	public int changeYearIfApproved() {
		
		// TODO implementar: el estudiante debe al próximo avanzar año si el grado es >= 60 // Hacer año = año + 1, e imprimir "Felicitaciones" si el estudiante ha sido aprobado
		 if(grade>=60) {
			 System.out.println("Congratulations");
			 int newYear = year + 1;
			 return newYear;
		 }else {
			 return 0;
		 }
	}
	
	
	//Constructor Nombre completo
	public Student(String firstName, String lastName, int registration, int grade, int year) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	}

	

	

	
}
