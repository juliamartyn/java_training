import java.io.*;

public class DirectoryPrezentFilter {

	public static void main(String[] args) {
		String dirname = "C:\\Users\\User\\eclipse-workspace\\LR_4\\src\\";
		File f1 = new File(dirname);
		FilenameFilter only = new OnlyExt("java");
		String s[] = f1.list(only);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}


}

