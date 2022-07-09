package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
	
	public static void main(String[] args) {
		
		//Declare Arraylist
		//ArrayList al=new ArrayList();
		//ArrayList<Integer> al =new ArrayList<Integer>();
		//ArrayList<String> al =new ArrayList<String>();
		//List ls=new ArrayList();
		
		ArrayList al=new ArrayList();
		
		//Add new to ArrayList
		al.add(100);
		al.add("Welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		al.add(100);
		
		System.out.println(al);//[100, Welcome, 15.5, A, true, 100]
		
		//size
		System.out.println("No of the ArrayList="+al.size());

		
		//remove 
		al.remove(1);
		//System.out.println("A");
		System.out.println("after removing elements in arraylist="+al);//[100, 15.5, A, true, 100]

// insert a new element
		
		//add(index,object);
		al.add(2,"Java");
		System.out.println("Adding element in the assertion"+al);//[100, 15.5, Java, A, true, 100]

		
		//retrive specific element
		System.out.println(al.get(2));
		
		//Change element /replace
		al.set(2, "Python");
		System.out.println("Adter replacing ="+al);
		
		//search contains  -return true/false
		
		System.out.println(al.contains("Python"));//TRUE
		System.out.println(al.contains("C++"));//false
		
		//IsEmpty
		System.out.println(al.isEmpty());//false
		
		
		//For loop
		/*System.out.println("Reading using elements using for loop");
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}*/
		
		//2) For each loop
		
		/*
		 * System.out.println("Reading elements using for each loop");
		 for(Object e:al) {
			System.out.println(e);
		}*/
		
		//Iterator using
		
		
		System.out.println("Reading elements using Iterator");
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
