package collectionsConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class HowToIterateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> languageList = new ArrayList<String>();
		languageList.add("Java");
		languageList.add("Cobol");
		languageList.add("C++");
		languageList.add("C");

		System.out.println("By using normal for loop");
		for (int i = 0; i < languageList.size(); i++) {
			System.out.println(languageList.get(i));
		}

		System.out.println("By using for each loop");
		for (String language : languageList) {
			System.out.println(language);
		}

		System.out.println("By using iterator");
		Iterator<String> itrs = languageList.iterator();
		while (itrs.hasNext()) {
			String itrsData = itrs.next();
			System.out.println(itrsData);
		}

		System.out.println("By using List iterator");

		ListIterator<String> litr = languageList.listIterator();
		while (litr.hasPrevious()) {
			String lang = litr.previous();
			System.out.println(lang);
		}

		System.out.println("By using strems lamda loop");
		languageList.stream().forEach(e -> System.out.println(e));

ArrayList<String> names = new ArrayList<String>(Arrays.asList("QA","QA1", "QA2", "QA3"));
System.out.println(names);
	
	}

}
