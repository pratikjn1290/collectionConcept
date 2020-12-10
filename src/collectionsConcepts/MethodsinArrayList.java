package collectionsConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MethodsinArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> Ar1 = Collections.synchronizedList(new ArrayList<String>());

		Ar1.add("Java");
		Ar1.add("Python");
		Ar1.add("DevOps");
		Ar1.add("DD");

		ArrayList<String> Ar2 = new ArrayList<String>();
		Ar2.add("PHP");
		Ar2.add("RUBY");
		Ar1.addAll(4, Ar2);
		System.out.println(Ar1);

		System.out.println(Ar1.contains("Python"));
		System.out.println(Ar1.contains("P"));

		CopyOnWriteArrayList<String> str = new CopyOnWriteArrayList<String>();
		str.add("Hello");
		str.add("Hi");

	}

}
