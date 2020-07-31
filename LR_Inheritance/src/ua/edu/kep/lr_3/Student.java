package ua.edu.kep.lr_3;
import ua.edu.kep.Human;

public class Student extends Human {
	private int course;
	private String groupName;
	
	public int getCourse() {
		return course;
	}
	public void setCourse(int value){
		if (value >= 1 && value <= 4) {
		course = value;
		}
		else System.out.println("Incorrect input! Enter a value from 1 to 4");
	}
	
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String value){
		groupName = value.trim();
	}
	
	public void print() {
		super.print();
		
		System.out.println("Course = " + course);
		System.out.println("GroupName = " + groupName);
	}
	
	public Student() {
		  System.out.println("Initialize object Student");
	}

	public Student(String name, int age, String groupName, int course) {
		super(name, age);
		this.groupName = groupName.trim();
		this.course = course;
	}
}
