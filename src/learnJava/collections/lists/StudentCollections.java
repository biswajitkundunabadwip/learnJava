package learnJava.collections.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class DescendingStudents implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		
		return Integer.compare(student2.getId(),student1.getId());
	}
	
}

public class StudentCollections {
	public static void main(String[] args) {
		Student s1= new Student(1, "BK");
		Student s2= new Student(2, "RK");
		Student s3= new Student(3, "SM");
		List<Student> studentCollections = new ArrayList<Student>();
		studentCollections.add(s1);
		studentCollections.add(s2);
		studentCollections.add(s3);

		System.out.println("Student collections : "+studentCollections);
		
		Collections.sort(studentCollections);
		System.out.println("Ascending order on id : "+studentCollections);
		System.out.println("-----------------------------------------");
//		Collections.sort(studentCollections,new DescendingStudents());
		studentCollections.sort(new DescendingStudents());
		System.out.println("Dscending order on id : "+studentCollections);
		
		
	}
}
