package hashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
	
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(2, "B");
		map2.put(3, "A");
		map2.put(1, "C");

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(4, "C");
		map3.put(3, "A");
		map3.put(2, "B");
		map3.put(1, "D");

		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		map4.put(3, "A");
		map4.put(2, "B");
		map4.put(1, "D");

		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		map5.put(4, "C");
		map5.put(3, "C");
		map5.put(2, "B");
		map5.put(1, "D");
		
		
		HashMap<Integer, String> map6 = new HashMap<Integer, String>();
		map6.put(3, "A");
		map6.put(2, "B");
		map6.put(1, "D");
		map6.put(4, "C");

		// Findout Extra Key from two hashmap

		HashSet<Integer> CombineLkeys = new HashSet<>(map1.keySet());
		CombineLkeys.addAll(map3.keySet());
		CombineLkeys.removeAll(map1.keySet());
		System.out.println(CombineLkeys);

		// On Basis of Key Value Pair

		System.out.println(map1.equals(map2)); // false
		System.out.println(map2.equals(map3)); // false

		// On basis of Key
		System.out.println(map1.keySet().equals(map3.keySet())); // false
		System.out.println(map2.keySet().equals(map1.keySet())); // true

		// On Basis of Value

		// When Duplicates are allowed

		System.out.println(new HashSet<>(map4.values()).equals(new HashSet<>(map5.values()))); //False
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values()))); //False

		// When No duplicated are allowed

		System.out.println(new ArrayList<>(map4.values()).equals(new ArrayList<>(map5.values()))); //False
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values()))); //False
	}

}
  