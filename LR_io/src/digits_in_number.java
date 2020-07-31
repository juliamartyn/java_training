import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class digits_in_number {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = in.nextInt();  
		int count = 0;
		for ( ; n != 0 ; n /= 10)
		    ++count;
		System.out.println("The number of digits in the number  = " + count);
		
		try {
			FileOutputStream fileOutput = new FileOutputStream("countNumber.txt");
			ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
			objectOutput.writeObject(count);
			objectOutput.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		in.close();
	}

}
