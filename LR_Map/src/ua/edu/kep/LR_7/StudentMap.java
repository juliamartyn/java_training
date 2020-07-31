package ua.edu.kep.LR_7;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {

	public static void main(String[] args) {
		Map<String, Float> students = new HashMap<String, Float>();
		Map<String, StudentInfo> studentsInfo = new HashMap<String, StudentInfo>();
		
		students.put("Onyschuk Nazariy",  8.28f);
		students.put("Boychuk Denis", (float) 5.94f);
		students.put("Gava Oleg", (float) 10.0f);
		students.put("Kovalchuk Andrey", (float) 6.85f);
		students.put("Boretska Olga", (float) 11.63f);
		students.put("Stasiuk Anna", (float) 7.48f);
		
		StudentInfo info = new StudentInfo();
		info.setMinimal(7);
		info.setAverage((float) 8.4);
		info.setMaximal(10);
		studentsInfo.put("Vasya Pupkin", info);
		
		StudentInfo info2 = new StudentInfo();
		info2.setMinimal(9);
		info2.setAverage((float) 10);
		info2.setMaximal(11);
		studentsInfo.put("Gava Oleg", info2);
		
		StudentInfo info3 = new StudentInfo();
		info3.setMinimal(5);
		info3.setAverage((float) 7.1);
		info3.setMaximal(8);
		studentsInfo.put("Stanislavsky Mark", info3);
		
		StudentInfo info4 = new StudentInfo();
		info4.setMinimal(10);
		info4.setAverage((float) 10.0);
		info4.setMaximal(10);
		studentsInfo.put("Melnik Galina", info4);
		
		//output all Minimal, Maximal, Average scores
		System.out.println("-------------------------------------------------");
		System.out.println("Minimal scores");
		for (StudentInfo eachValue : studentsInfo.values()) {
			System.out.println(eachValue.getMinimal());
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Maximal scores");
		for (StudentInfo eachValue : studentsInfo.values()) {
			System.out.println(eachValue.getMaximal());
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Average scores");
		for (Map.Entry<String, StudentInfo> eachEntry : studentsInfo.entrySet()) {
			if (eachEntry.getValue().getAverage() >= 7.0f) {
				System.out.println(eachEntry.getKey() + "  " +  eachEntry.getValue().getAverage());
			}
		}
		
		//output information about arithmetic mean and subtract value of scores
		System.out.println("-------------------------------------------------");
		for (Map.Entry<String, StudentInfo> eachEntry : studentsInfo.entrySet()) {
			System.out.println(eachEntry.getKey() + " | the arithmetic mean of the maximum and minimum points =  "
					+ ((eachEntry.getValue().getMaximal() + eachEntry.getValue().getMinimal()) / 2.0f)
					+ " | subtract value = " + (eachEntry.getValue().getMaximal()
							- ((eachEntry.getValue().getMaximal() + eachEntry.getValue().getMinimal()) / 2.0f)));
		}
		
		//change values for student Vasya Pupkin
		info.setMinimal(9);
		info.setAverage((float) 10);
		info.setMaximal(11);
		studentsInfo.put("Vasya Pupkin", info);
		
		
		//list of students whose scores(max/min/avg) are equal
		System.out.println("-------------------------------------------------");
		for (Map.Entry<String, StudentInfo> eachEntry1 : studentsInfo.entrySet()) {
			String key1 = eachEntry1.getKey();
			int hash1 = System.identityHashCode(key1);
			StudentInfo value1 = eachEntry1.getValue();
			for (Map.Entry<String, StudentInfo> eachEntry2 : studentsInfo.entrySet()) {
				String key2 = eachEntry2.getKey();
				int hash2 = System.identityHashCode(key2);
				StudentInfo value2 = eachEntry2.getValue();
				if (hash1 > hash2) {
					if (value1.getMaximal() == value2.getMaximal()) {
						System.out.println("Maximum scores are equal in student:");
						System.out.println(key1 + " " + value1.getMaximal() + " = " + key2 + " " + value2.getMaximal());
					}
					if (value1.getMinimal() == value2.getMinimal()) {
						System.out.println("Minimum scores are equal in student:");
						System.out.println(key1 + " " + value1.getMinimal() + " = " + key2 + " " + value2.getMinimal());
					}
					if (value1.getAverage() == value2.getAverage()) {
						System.out.println("Average scores are equal in student:");
						System.out.println(key1 + " " + value1.getAverage() + " = " + key2 + " " + value2.getAverage());
					}
				}

			}
		}
	}

}
