package hashMapConcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class HashmapInitialization {

	public static void main(String args[]) {

		HashMap<String, String> hm = new HashMap();

		Map<String, String> map = new HashMap();

		// static

		// Immutable map with only one single entry
		Map<String, Integer> map3 = Collections.singletonMap("tets", 100);
		map3.get("test");
	}

	public static Map<String, Integer> markMap;
	static {
		markMap = new HashMap<String, Integer>();
		markMap.put("K", 100);
		markMap.put("L", 200);

		Map<String, String> hmi = Collections.singletonMap("abc", "100");
		System.out.println(hmi.get("abc"));

	}
}
