import java.io.File;

public class FilePrezent {
	static void p(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\User\\eclipse-workspace\\LR_4\\src\\FilePrezent.java");
		p("File name: " + f1.getName());
		p("Path: " + f1.getPath());
		p("Full path: " + f1.getAbsolutePath());
		p("Parent directory: " + f1.getParent());
		p(f1.exists() ? " exist" : " not exist");
		p(f1.canWrite() ? " for writing" : " not for writing");
		p(f1.canRead() ? " for reading" : " not for reading");
		p("Last file modified: " + f1.lastModified());
		p("File size " + f1.length() + " bytes");
	}

}
