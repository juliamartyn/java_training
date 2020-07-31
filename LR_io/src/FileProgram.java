import java.io.File;
import java.io.IOException;

public class FileProgram {

	public static void main(String[] args) throws IOException {
		File file = new File ("file.txt");
		file.createNewFile();
		System.out.println("Exist: " + file.exists());
		System.out.println("Full path: " + file.getAbsolutePath());
		
		File directory=new File("c:/users/");
		System.out.println("Directory: " + directory.isDirectory());
		
		System.out.println("Directory: " + directory.getName());
		String[] files = directory.list();
		for (String each : files) {
			if(directory.isDirectory() == true) {
				System.out.print(" Directory:");
			} else {
				System.out.print(" File:");
			}
			System.out.println(" " + each);
		}
	}

}
