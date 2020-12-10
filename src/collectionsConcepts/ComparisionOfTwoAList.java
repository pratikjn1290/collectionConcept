package collectionsConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComparisionOfTwoAList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "G"));
		ArrayList<String> al2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F", "G"));
		ArrayList<String> al3 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F", "G"));

		Collections.sort(al1);
		Collections.sort(al2);
		Collections.sort(al3);
		System.out.println(al1.equals(al2));
		System.out.println(al3.equals(al2));

		ArrayList<String> al6 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "G"));
		ArrayList<String> al5 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F", "G"));

		al5.removeAll(al6);
		System.out.println(al5);

		al6.removeAll(al5);
		System.out.println(al6);

		
		ArrayList<String> al7 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		ArrayList<String> al8 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		
		al7.retainAll(al8);
		System.out.println(al7);
	}

}
