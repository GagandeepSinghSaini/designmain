package dao;

import java.util.List;

public interface IStudentDao {

	public List<Student> getAllStudents();
	public Student getStudent(int rollNo);
	public boolean addStudent(Student student);
	public boolean deleteStudent(Student student);
	
}
