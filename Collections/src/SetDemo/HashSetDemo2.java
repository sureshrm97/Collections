package SetDemo;

import java.util.HashSet;

public class HashSetDemo2 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> evn=new HashSet<Integer>();
		
		evn.add(4);
		evn.add(6);
		evn.add(8);
		
		System.out.println("HashSet="+evn);
		
		HashSet<Integer> numbers=new HashSet<Integer>();
		numbers.addAll(evn);
		numbers.add(10);
		
		
		System.out.println("New HashSet="+numbers);//[4, 6, 8, 10]
		
		
		numbers.removeAll(evn);
		System.out.println(numbers);
		

		
		
	}

}
