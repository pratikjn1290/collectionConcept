package collectionsConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		ArrayList<String> als = new ArrayList<String>();
		als.add("Hello");
		als.add("Hi");
		als.add("Hello");
		als.add("How");
		als.add("Are");
		als.add("Are");
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>(als);

		ArrayList<String> lhswduplicate = new ArrayList<String>(lhs);
		System.out.println(lhswduplicate);
		
		Iterator<String> itr = lhs.iterator();
		{
			while (itr.hasNext())
				System.out.println(itr.next());
		}

		
		List <Object> lst = als.stream().distinct().collect(Collectors.toList());
		System.out.println(lst);
	}
	
	
	

}
