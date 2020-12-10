package hashMapConcepts;

import java.util.HashMap;

public class InternalWorkingHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hash code for null value is always zero, null is stored at zero position,
		//for different hash code getting same index value is called as hash map collision,
		// internally hash map maintains the linked list when diffenrent hascode values store at same index location
		
		
		HashMap <String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("Pratik",100);
		hm.put("Akins",200);
		hm.put("Komal",300);
		hm.put("Mukesh",400);
		hm.put("Naveen",500);
		hm.put("null",600);
		
		String s = new String("Hello How are you! Hi");
		System.out.println(s);
		
		System.out.println(s.charAt(0)); //1 st occurance
		System.out.println(s.indexOf("H", 0));
		System.out.println(s.lastIndexOf('H'));
		System.out.println(s.indexOf('H', s.indexOf('H')+1 ));
	}

}
