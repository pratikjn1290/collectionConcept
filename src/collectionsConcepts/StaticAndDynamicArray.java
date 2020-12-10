package collectionsConcepts;

import java.util.ArrayList;

public class StaticAndDynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i[] = new int[5];
		System.out.println((i.length));

		i[0] = 43;
		i[1] = 43;
		i[2] = 43;
		i[3] = 43;
		i[4] = 43;

		// Array is static collection has same data type;
		// Array is static and has fox length

		// Dyanmic array :ArrayList
		//Negative indexing is also not allowed
		//Size would be size
		//Lowest index = 0
		//Highest index size-1
		//

		ArrayList<String> str = new ArrayList<String>();

		str.add("Java");
		str.add("MAVA");
		str.add("LAVA");
		str.add("QA");
		str.add("WA");
		str.add("Home");

		System.out.println(str.size());

		System.out.println(str.get(0));
		System.out.println(str.get(1));
		System.out.println(str.get(2));
		System.out.println(str.get(5));

	}

}
