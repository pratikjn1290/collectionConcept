package collectionsConcepts;

import java.util.ArrayList;

public class VirtualCapacityConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Virtual Capacity is 10
		//Actual Capacity is 5
		//After full of capacty it increase the Physical capacity and decrese vc
		//Virtual Capacity can be increased by Using size when we initialize the object
		
		ArrayList<Object>al = new ArrayList<Object>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		System.out.println(al.size());
		
		al.add(500);
		
		System.out.println(al.size());
		
		al.set(4, 200);
		
		System.out.println(al.size());

	}

}
