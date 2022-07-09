package CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add("W");
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		ArrayList al2=new ArrayList();
		
		al2.addAll(al);
		System.out.println(al2);
		
		al2.removeAll(al);
		System.out.println("Removing after elements="+al2);
		
		//Sort collectins
		
		System.out.println("Before Sorting ="+al);
		Collections.sort(al);
		System.out.println("After Sorting ="+al);
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Elements array in the list of the reverse order="+al);
		
		//Shuffle 
		Collections.shuffle(al);
		System.out.println("Elements array in the list of the shuffling order="+al);

		
		//


		

	}

}
