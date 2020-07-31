import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderPrezent {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\User\\eclipse-workspace\\LR_4\\src\\FilePrezent.java");
		BufferedReader br = new BufferedReader(fr);
		String s;
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
		fr.close();
	}

}
