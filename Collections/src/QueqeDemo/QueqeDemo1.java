package QueqeDemo;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueqeDemo1 {

	public static void main(String[] args) {

		PriorityQueue pq = new PriorityQueue();

		pq.add("A");
		pq.add("B");
		pq.add("C");
		pq.add("C");
		System.out.println(pq);// insertion order allowed preserved & duplicates are allowed [A, B, C, C]

		// get head element peek()

		// System.out.println(pq.element()); //A
		// System.out.println(pq.peek());// Returns head element , if empty return null

		// Return & Reverse elements from queqe remove() null
		System.out.println(pq.remove());
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		Iterator it=pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		


	}

}
