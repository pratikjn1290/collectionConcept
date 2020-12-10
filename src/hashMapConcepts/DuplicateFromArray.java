package hashMapConcepts;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 4, 3, 45, 55, 44, 55 };

		System.out.println("By using normal for loop");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplictae value is:- " + arr[i]);
				}
			}
		}

		System.out.println("By using hashset");
		Set<Integer> hs = new HashSet<Integer>();
		for (Integer elem : arr) {
			if (hs.add(elem) != true) {
				System.out.println("Duplicate Value is: " + elem);
			}
		}

		System.out.println("By using Streams");

		List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());
		List<Integer> al = list.stream().distinct().collect(Collectors.toList());
		System.out.println(al);
		
		}
}