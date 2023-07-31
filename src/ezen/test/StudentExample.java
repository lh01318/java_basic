package ezen.test;

public class StudentExample {

	 public static void main(String[] args) {
	        Student[] students = new Student[4];
	        
	        students[0] = new Student("강호동", 70, 80);
	        students[1] = new Student("박명수", 90, 100);
	        students[2] = new Student("유재석", 80, 55);
	        students[3] = new Student("홍길동", 60, 75);
	        
	        StudentMethod.StudentMethod(students);
	    }

}
