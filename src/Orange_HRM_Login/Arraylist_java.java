 package Orange_HRM_Login;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class Arraylist_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		List<String> List = new ArrayList<>();
		List.add("A");
		List.add("B");
		List.add("C");
		List.add("D");
		
		List<String> List1 = new LinkedList<>();
		List1.add("A");
		List1.add("B");
		List1.add("C");
		List1.add("D");
		System.out.println(List);
		System.out.println(List1);
		
		for(String lst: List)
		{
			System.out.println(lst);	
			
		}
		
	}

}
