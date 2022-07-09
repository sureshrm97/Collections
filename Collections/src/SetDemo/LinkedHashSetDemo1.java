package SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
	
	
	public static void main(String[] args) {
		//LinkedHashSet lhs=new LinkedHashSet();
		//LinkedHashSet<Integer> lhs2=new LinkedHashSet<Integer>();

		//HashSet lhs=new HashSet();
		LinkedHashSet lhs=new LinkedHashSet();

		lhs.add(100);
		lhs.add(200);
		lhs.add(300);
		lhs.add(400);
		lhs.add(500);
		
		System.out.println("HashSet is linked="+lhs);

		
	}

}
