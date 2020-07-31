package ua.edu.kep.lr_3;
import ua.edu.kep.Human;

public class Program2 {

	public static void main(String[] args) {
		Human s1 = new Student("Vasya Pupkin", 18, "     PE-17-01", 3);
		s1.print();
		Student a = new Student();
		a.setCourse(5);
		System.out.println("course = " + a.getCourse());
	}
}
