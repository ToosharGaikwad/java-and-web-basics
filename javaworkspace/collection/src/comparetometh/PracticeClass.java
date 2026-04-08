package comparetometh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PracticeClass {
	public static void main(String[] args) {
//		
//		Comparator<Integer> com = new Comparator<Integer>() {
//			
//			@Override
//			public int compare(Integer i, Integer j) {
//			if(i%10>j%10) 
//				return 1;
//			else
//				return-1;
//		}
//		};
		

		Comparator<String> com = new Comparator<String>() {
			
			@Override
			public int compare(String i, String j) {
			if(i.length()<j.length()) 
				return 1;
			else
				return-1;
		}
		};
		
	
//	List<Integer> list = new ArrayList<Integer>(List.of(38,32,25));
//	list.add(56);
	
		List<String> list = new ArrayList<String>(List.of("tsush,tusar,vaoi,sam"));
	
	Collections.sort(list,com);
	
	System.out.println(list);
}
}
