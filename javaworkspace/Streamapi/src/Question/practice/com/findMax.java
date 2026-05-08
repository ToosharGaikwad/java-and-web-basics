package Question.practice.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class findMax {
public static void main(String[] args) {
	
	List<Integer> list =Arrays.asList(3,22,34,22,333,1,34);
	Stream stream ;
//	 list.stream().filter(x->x%2==0).collect(Collectors.toList()).forEach(System.out::println);
	System.out.println(list.stream().max(Integer::compare));
	
//	long coun = list.stream().count();
//	 System.out.println(coun);
//	 list.stream().distinct().collect(Collectors.toList()).forEach(x->System.out.print(x +" "));
	  
	 
	 
}
}
