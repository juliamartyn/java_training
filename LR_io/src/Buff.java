import java.io.*;
public class Buff {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int i;
		int suma = 0;
		System.out.println("Enter arbitrary numbers from 0 to quit ...");
		do {
			str = br.readLine();
			try {
				i = Integer.parseInt(str);
			} catch (NumberFormatException e) {
				System.out.println("Invalid format");
				i = 0;
			}
			suma += i;
			System.out.println("The current amount is equal: " + suma);
		} while (i != 0);
	}
}

