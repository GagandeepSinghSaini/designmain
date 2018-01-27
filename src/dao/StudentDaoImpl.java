package dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements IStudentDao {

	@Override
	public List<Student> getAllStudents() {
		System.out.println("Hit DB to get all students");
		return new ArrayList<>();
	}

	@Override
	public Student getStudent(int rollNo) {
		System.out.println("Hit DB to get a student");
		return new Student("", 0);
	}

	@Override
	public boolean addStudent(Student student) {
		System.out.println("Hit DB to add a student");
		return false;
	}

	@Override
	public boolean deleteStudent(Student student) {
		System.out.println("Hit DB to delete a student");
		return false;
	}

}
