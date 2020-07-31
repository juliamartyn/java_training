import java.io.File;

public class DirectoryPrezent {

	public static void main(String[] args) {
		String dirname = "C:\\Users\\User\\eclipse-workspace\\LR_4\\";
		File f1 = new File(dirname);
		if (f1.isDirectory()) {
			System.out.println("Directory " + dirname);
			String s[] = f1.list();
			for (int i = 0; i < s.length; i++) {
				File f = new File(dirname + "/" + s[i]);
				if (f.isDirectory()) {
					System.out.println(s[i] + " - it's directory");
				} else {
					System.out.println(s[i] + " - it's file");
				}
			}
		} else {
			System.out.println(dirname + " - it isn't directory");
		}

	}

}
