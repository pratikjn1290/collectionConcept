package hashMapConcepts;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello how are you Hello";

		String[] str = s.split(" ");

		for (String str1 : str) {
			System.out.println(str1);
		}

		for (int i = 0; i < str.length; i++) {

			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equalsIgnoreCase(str[j])) {
					System.out.println("Duplicate Value:- " + str[i]);
				}
			}

		}

		List<String> strData = Stream.of(str).distinct().collect(Collectors.toList());
		System.out.println(strData);

		Set<String> hs = new HashSet<String>();
		for (String s1 : hs) {

			if (hs.add(s1) != true) {
				System.out.println("Duplicate value: " + s1);
			}

		}
	}

}
