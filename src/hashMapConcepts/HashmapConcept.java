package hashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapConcept {

	// No order, No indexing,
	// Duplicate key not allowed, only one null key allowed, multiple null allowed,
	// not thread-safe, not synchronized
	// Keyvalue pair maintained

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("USA", "DC");
		hm.put("India", "DL");
		hm.put("UK", "London");

		// Using Keyset
		Iterator<String> keys = hm.keySet().iterator();

		while (keys.hasNext()) {
			String it = keys.next();
			System.out.println(hm.get(it));
		}

		// Using Entry Set
		Iterator<Entry<String, String>> entry = hm.entrySet().iterator();
		while (entry.hasNext()) {
			Entry<String, String> s1 = entry.next();
			System.out.println(s1.getKey() + " " + s1.getValue());
		}

		// Using lambda function
		hm.forEach((k, v) -> System.out.println("key =" + k + "Value =" + v));

	}

}
