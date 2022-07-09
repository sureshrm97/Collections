package LinkedList;

import java.util.LinkedList;

public class LinkedListDemo3 {
	
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		
		l.add("Dog");
		l.add("Cat");
		l.add("Monkey");
		l.add("Horse");
		
		System.out.println(l);
		l.addFirst("Tiger");
		l.addLast("Lion");
		
		System.out.println("After adding list ="+l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		//removing first and last elements
		
		l.removeFirst();
		l.removeLast();
		
		System.out.println("Removing list in First & and Last="+l);



	}

}
