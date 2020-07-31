package ua.edu.kep.LR_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ProgramList {

	public static void main(String[] args) {
		List<Integer> list  = new ArrayList<Integer>();
		List<Integer> list2  = new ArrayList<Integer>();
		List<Integer> list3  = new ArrayList<Integer>();

		//initialize List "list"
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(2);
		list.add(1);
		
		//initialize List "list2"
		list2.add(8);
		list2.add(9);
		list2.add(3);
		
		//add elements of "list2" to "list"
		list.addAll(list2);
		for(Integer each : list) {
			System.out.println(each);
		}
		
		Random r = new Random();
		
		//initialize List "list3" by random numbers
		for(int i = 0; i < 12; i++) {
			list3.add(r.nextInt(100));
		}
		
		//add elements of "list" to "list3"
		list3.addAll(list);
	
		//sorting "list3"
		Collections.sort(list3);
		
		//output elements of List "list3"
		for(Integer each : list3) {
			System.out.println(each);
		}
	}

}
