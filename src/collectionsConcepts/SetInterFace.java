package collectionsConcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterFace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Duplicate not allowed,
		// Mathematicall operation done
		// mantain no order

		Set<String> str = new HashSet<String>();
		str.add("QATest");
		str.add("Alpha");
		str.add("BETA");
		str.add("QA");
		str.add("QA");

		Iterator<String> itr = str.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(str);

		System.out.println(str.contains("QA"));

		for (String strr : str) {
			System.out.println(strr);
		}

		Set<Integer> hsFirst = new HashSet<Integer>();
		hsFirst.addAll(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));

		Set<Integer> hsSecond = new HashSet<Integer>();
		hsSecond.addAll(Arrays.asList(new Integer[] { 4, 5, 6, 7, 8, 9 }));

		//Union
		Set<Integer> union = new HashSet<Integer>(hsFirst);
		union.addAll(hsSecond);
		System.out.println(union);
		//Intersection
		
		
		
		Set<Integer> interSection = new HashSet<Integer>(hsFirst);
		interSection.retainAll(hsSecond);
		System.out.println(interSection);
		
		//Difference
		Set<Integer> diff = new HashSet<Integer>(hsFirst);
		diff.removeAll(hsSecond);
		System.out.println(diff);

	}
}
