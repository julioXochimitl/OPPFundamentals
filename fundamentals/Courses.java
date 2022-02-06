package fundamentals;

import java.util.HashSet;
import java.util.Set;

public class Courses {
	
	String courseNam;
	String professorName;
	int year;
	int num;
	HashSet<String> students = new HashSet<String>();
	
	public static void main(String[] args) {
		
		Courses studentOne = new Courses("Hola", "Julio", 0, 0, null);
		
		studentOne.enroll(null);
	}
	
	public Courses(String courseNam, String professorName, int year, int num, HashSet<String> students) {
		super();
		this.courseNam = courseNam;
		this.professorName = professorName;
		this.year = year;
		this.num = num;
		this.students = students;
	}
	
	public void enroll(HashSet<String> collections){
			this.students.add(courseNam);
	   }

	   public void unEnroll(Student student){
	       //TODO remove this student from the collection
	       // Hint: check if that really is this student
	   }

	   public int countStudents(){
	       //TODO implement
	       return 0;
	   }
	   
	   public int bestGrade(){
	       //TODO implement
	       return 0;
	   }

}
