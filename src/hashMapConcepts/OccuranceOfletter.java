package hashMapConcepts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class OccuranceOfletter {

	public static void main(String args[]) {

		String str = "hello";
		char ch[] = str.toCharArray();

		Arrays.sort(ch);

		HashMap<Character, Integer> characters = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (characters.containsKey(c)) {
				characters.put(c, characters.get(c) + 1);
			}

			else {
				characters.put(c, 1);
			}

		}

		for (Entry<Character, Integer> entry : characters.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Key: " + entry.getKey() + " " + "Value: " + entry.getValue());

			}
		}

		//Rev number
		int number = 1234;
		int rev = 0;
		while(number!=0)
		{
			int digit = number%10;
			rev = digit + (rev * 10);
			number = number/10;
		}
		
		System.out.println(rev);
		
		//Pelindrom
		
		int n = 153;
		int sum = 0;
		while(n != 0 )
		{
		int digits = n % 10;
		sum = sum + (digits * digits * digits);
		n = n/10;
			
		}
		
		System.out.println(sum);
	}

}
