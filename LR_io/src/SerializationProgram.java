import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationProgram {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName("Julia");
		student1.setAge(18);
		student1.setGroup("PE-17-01");
		try {
			FileOutputStream fileOutput = new FileOutputStream("file.txt");
			ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
			objectOutput.writeObject(student1);
			objectOutput.close();
			FileInputStream fileInput= new FileInputStream("file.txt");
			ObjectInputStream objectOutput2 = new ObjectInputStream(fileInput);
			Student student2 = (Student) objectOutput2.readObject();
			System.out.println(student2.getName());
			System.out.println(student2.getAge());
			System.out.println(student2.getGroup());
			objectOutput2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
