package collectionsConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class VirtualCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> al = new ArrayList<Object>();
		al.add("Hello");

		ArrayList<String> Sname = new ArrayList<String>();
		Sname.add("Aname");
		Sname.add("Hi");
		Sname.add("Hello");

		System.out.println("-----------Noraml For Loop-------------");
		
		for (int i = 0; i < Sname.size(); i++) {
			System.out.println(Sname.get(i));
		}

		System.out.println("-----------For each For Loop-------------");
		for (String elem : Sname) {
			System.out.println(elem);
		}

		System.out.println("-----------Lamda-------------");
		Sname.stream().forEach(elem1 -> System.out.println(elem1));

		System.out.println("-----------Iterator-------------");
		Iterator<String> itr = Sname.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		
		System.out.println("-----------List Itrator-------------");
		
		ListIterator<String> ls =  Sname.listIterator();
		while(ls.hasPrevious())
		{
			String d1 = ls.previous();
			System.out.println(d1);
			
		}
		
		ArrayList<Integer> ALS = new ArrayList<Integer>(Arrays.asList(2,3,5,7));
		System.out.println(ALS);

		ArrayList<String> Alsg = new ArrayList<String>(Arrays.asList("Jabva", "Facebook"));
		System.out.println(Alsg);
		System.out.println(Alsg.size());
		
	}

}
