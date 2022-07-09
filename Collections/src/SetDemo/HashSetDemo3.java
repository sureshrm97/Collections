package SetDemo;

import java.util.HashSet;

public class HashSetDemo3 {
	
	public static void main(String[] args) {
		
		//union, differences, Interactions
		HashSet<Integer> hs=new HashSet<Integer>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		
		System.out.println("HashSet+"+hs);
		
		HashSet<Integer> hs2=new HashSet<Integer>();
		hs2.add(3);
		hs2.add(4);
		hs2.add(5);
		System.out.println("Hashset 2="+hs2);
		
		
		//union
		/*s.addAll(hs2);
		System.out.println("Union numbers="hs);*/


		/*//interaction
		hs.retainAll(hs2);
		System.out.println("Interactions="+hs);*/
		
		
		//differances
		/*hs.removeAll(hs2);
		System.out.println("Differances="+hs);*/
		
		System.out.println(hs.containsAll(hs2));
		System.out.println("subset="+hs);

	}

}
