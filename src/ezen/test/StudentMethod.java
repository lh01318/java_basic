package ezen.test;

public class StudentMethod {
	 public static void StudentMethod(Student[] students) {
	        for (int i = 0; i < students.length; i++) {
	            int rank = 1;
	            for (int j = 0; j < students.length; j++) {
	                if (students[j].total() > students[i].total()) {
	                    rank++;
	                }
	            }
	            System.out.println("이름: " + students[i].getName() + " 총점: " + students[i].total() + " 순위: " + rank);
	        }
	    }
	}


