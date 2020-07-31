import java.util.Scanner;

public class Notation_transfer__used_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int number;
		System.out.println("Enter the number you want to convert to other number systems:");
		number = sc.nextInt(); 	
		
		System.out.println(number + "  in the binary system "
				+ Integer.toBinaryString(number));

		System.out.println(number + "  in the octal system "
				+ Integer.toOctalString(number));
		
		System.out.println(number + "  in the hexadecimal system "
				+ Integer.toHexString(number));
		
		sc.close();
	}

}
