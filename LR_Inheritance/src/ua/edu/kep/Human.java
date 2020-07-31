package ua.edu.kep;

public class Human {
	private String name;
	private int age;
	private String address;
	private String city;
	private String country;
	private String phone;
	private int height;
	private int weight;
		
	public String getName() {
		return name;
	}
	public void setName(String value){
		name = value.trim();
	}

	public int getAge() {
		return age;
	}
	public void setAge(int value){
		   if (value >= 0 && value <= 100) {
		       age = value;
		   } else {
		       System.out.println("Incorrect input. Enter a number from 0 to 100");
		   }
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String value){
		address = value;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String value){
		city = value;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String value){
		country = value;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String value){
		phone = value;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int value){
		height = value;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int value){
		weight = value;
	}


	public void print() {
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
		System.out.println("Address is " + address);
		System.out.println("City is " + city);
		System.out.println("Country is " + country);
		System.out.println("Phone is " + phone);
		System.out.println("Height is " + height);
		System.out.println("Weight is " + weight);
	}

	public void printAgeInfo() {
		System.out.println("Age is " + age);
		if (age < 12) {
			System.out.println("child");
		}
		else if (age < 18) {
			System.out.println("підліток");
		}
		else if (age <= 22) {
			System.out.println("teenager");
		}
		else if (age > 22 && age < 60) {
			System.out.println("middle age");
		}
		else if (age > 60) {
			System.out.println("old age");
		}

	}

	public void printAdressPhone(){
		System.out.println("Address is " + address);
		System.out.println("Phone is " + phone);
	}
	
	public int avgWeight() {
		return height/weight;
	}

	public Human() {
		  System.out.println("Initialize object Human");
		}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
