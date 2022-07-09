package CollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {
	
	public static void main(String[] args) {
		String arr[]= {"Lion","Cat","Dog","Elephant","Tortile","Monkey"};
		for(String e:arr) {
			System.out.println(e);
		}
		
		ArrayList al=new ArrayList(Arrays.asList(arr));
		System.out.println(al);
		
	}

}
