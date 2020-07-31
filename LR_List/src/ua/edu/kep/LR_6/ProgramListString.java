package ua.edu.kep.LR_6;

import java.util.ArrayList;
import java.util.List;

public class ProgramListString {
	//comparison of lists 
	//if the number of elements in the lists is the same
	public static boolean compareString(List<String> strings, List<String> strings2) {
		boolean a = false;
		if(strings.size() == strings2.size()) {
			boolean b = strings.equals(strings2);
			return b;
			}
		return a;
	}
	
	//check if the string is in the List
	public  static boolean containsString(List<String> strings, String string) {
		   for (String each : strings) {
		      if (each.equals(string)) {
		         return true;
		      }
		   }
		    return false;
		}


	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		List<String> strings2 = new ArrayList<String>();
		
		//initialize List "strings"
		strings.add("Hello");
		strings.add("world");
		strings.add("!");
		strings.add(":)");
		
		//output of the inverse elements of List "strings"
		for(int i = strings.size() - 1; i >= 0; i--) {
			System.out.print(strings.get(i) + " ");
		}
		
		System.out.println("\nThe length of the list: " + strings.size());

		//initialize List "strings2"
		strings2.add("Hi");
		strings2.add("Julia");
		strings2.add("!");
		
		//output  elements of List "strings2" using the method get
		System.out.println(strings.get(2));
		System.out.println(strings.get(1));
		System.out.println(strings.get(0));
		
		//output  elements of List "strings2" using loop for
		for(String each : strings2) {
			System.out.print(each + " ");
		}
		
		//output index of element "world"
		System.out.println(strings.indexOf("world"));
		
		//checking the equality of lists by method compareString
		System.out.println("Elements in lists are equal: " + compareString(strings, strings2));
		
		//checking is there word in list
		System.out.println("List 'strings' contain word 'Hello': "+ containsString(strings, "Hello"));
		
		//clear both lists
		strings.clear();
		strings2.clear();
	}

}
