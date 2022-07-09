package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		//Declare LinkedList
		
		//LinkedList l=new LinkedList();
		//LinkedList<Integer> l=new LinkedList<Integer>();
		//LinkedList<String> l=new LinkedList<String>();

		
		LinkedList l=new LinkedList();
		
		l.add(10);
		l.add("WelCome");
		l.add(15.5);
		l.add('A');
		
		l.add(true);
		l.add(null);
		
		System.out.println(l);// print all the Elements
		
		System.out.println(l.size());// print size of the elements
		
		
		//remove 
		l.remove(2);
		System.out.println(l);// removing element in the list
		
		l.add(3,"Java");
		System.out.println("Adding elements in the list"+l);//[10, WelCome, A, Java, true, null]// after adding java
		
		System.out.println(l.contains("Java"));
		System.out.println(l.contains("Python"));
		
		//isEmpty
		System.out.println(l.isEmpty());
		
		//Reading objects from linkedList using for loop
		/*for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}*/
		
		//How to read data frome linkedlist using for each loop
	/*	for(Object e:l) {
			System.out.println(e);
		}*/
		
		//reading data from ll using Iterator Method
		
		Iterator it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

		



		
	}

}
