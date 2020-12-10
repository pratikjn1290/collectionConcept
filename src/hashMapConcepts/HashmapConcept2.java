package hashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashmapConcept2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("UK", "London");
		hm.put("USA", "NewYork");
		hm.put("INDIA", "DELHI");
		hm.put("LANKS", "COLOMBO");

		System.out.println("All key values: " + hm.get("UK"));
		System.out.println("All values: " + hm.values());

		Iterator<String> it = hm.keySet().iterator();
		while (it.hasNext()) {
			String itr = it.next();
			String value = hm.get(itr);
			System.out.println(value);
		}

		Iterator<Entry<String, String>> entry = hm.entrySet().iterator();
		while (entry.hasNext()) {
			Entry<String, String> en = entry.next();

			System.out.println(en);
		}

		hm.forEach((k, v) -> System.out.println("key= " + k + " Value= " + v));

	}

}
