import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamProgram {

	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream output = new FileOutputStream("file.txt");
			output.write("Julia".getBytes());
			output.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		FileInputStream input =new FileInputStream("file.txt");
	
		byte[] buffer = new byte[10];
		int length = input.read(buffer);
		while (length != -1) {
			System.out.println(new String(buffer, 0, length));
			length = input.read(buffer);
		}
		input.close();
	}

}
