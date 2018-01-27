package dao;

public class Client {

	public static void main(String[] args) {
		IStudentDao studentDao = new StudentDaoImpl();
		studentDao.addStudent(new Student("", 0));
		studentDao.deleteStudent(new Student("", 0));
	}
	
}
