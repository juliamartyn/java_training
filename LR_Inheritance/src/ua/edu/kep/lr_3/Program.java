package ua.edu.kep.lr_3;
import ua.edu.kep.Human;

public class Program {

	public static void main(String[] args) {
		Human h = new Human();
		h.setName("               Bogdan Khmelnitsky");	 
		h.setAge(200);
		h.setAddress("Nezalezhnosti Street 21/14");
		h.setCity("Kyiv");
		h.setCountry("Ukraine");
		h.setPhone("+380954785632");
		h.setHeight(170);
		h.setWeight(80);

		
		h.print();
		h.printAgeInfo();
		h.printAdressPhone();
		System.out.println("Weight distribution  = " + h.avgWeight());
	
		Human h2 = new Human("Ivan Mazepa", 32);
		System.out.println("Name = " + h2.getName());
		System.out.println("Age  = " + h2.getAge());
	}

}
