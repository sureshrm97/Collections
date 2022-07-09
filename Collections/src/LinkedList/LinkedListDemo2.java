package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {
	
	public static void main(String[] args) {
		
		
		LinkedList l=new LinkedList();
		l.add("W");
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		
		LinkedList l2=new LinkedList();
		l2.addAll(l);
		System.out.println(l2);
		
		l2.removeAll(l);
		System.out.println("Removing after elements="+l2);
		
		//Sort collectins
		
		System.out.println("Before Sorting ="+l);
		Collections.sort(l);
		System.out.println("After Sorting ="+l);
		
		Collections.sort(l, Collections.reverseOrder());
		System.out.println("Elements array in the list of the reverse order="+l);
		
		//Shuffle 
		Collections.shuffle(l);
		System.out.println("Elements array in the list of the shuffling order="+l);

		
		

		
	}

}
