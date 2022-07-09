package SetDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
	
	public static void main(String[] args) {
		
		
		//HashSet hs=new HashSet();//default  capacity is load faster
		
		
		
		//HashSet hs=new HashSet(100);//initial capacity in
		
		//HashSet hs=new HashSet(100, (float)0.90);

		//HashSet<Integer> hs=new HashSet<Integer>();//

		HashSet hs=new HashSet();//default  capacity is load faster

		hs.add(100);
		hs.add("Welcome");
		hs.add('A');
		hs.add(15.50);
		hs.add(true);
		hs.add(null);

		System.out.println(hs);//[null, A, 100, Welcome, 15.5, true]
		
		hs.remove("15.50");
		System.out.println("After removing the value="+hs);//[null, A, 100, Welcome, 15.5, true]
		
		
		//contains
		
		System.out.println(hs.contains("Welcome"));
		System.out.println(hs.contains("welcome"));
		
		//Is Empty
		System.out.println(hs.isEmpty());
		
		//reading objects /elements frome hashset using for each loop
		
		/*for(Object e: hs) {
			System.out.println(e);
		}*/
		
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		
	}

}
