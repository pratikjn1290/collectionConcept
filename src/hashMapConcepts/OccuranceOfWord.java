package hashMapConcepts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class OccuranceOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello How are you Hello";

		String[] arr = str.split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String arry : arr) {
			if (hm.containsKey(arry) == true) {
				hm.put(arry, hm.get(arry) + 1);
			} else {
				hm.put(arry, 1);
			}

		}
		
		for (Entry<String, Integer> entry : hm.entrySet()) {
			
			System.out.println(entry.getKey() + " " +entry.getValue());
		}
		
		
		Set<String> hs = hm.keySet();

		for (String word : hs) {

			if (hm.get(word) > 1) {

				System.out.println("Repeated word: " + word + " count " +hm.get(word));
			}
		}
	}

}
