package hashMapConcepts;

import java.util.Arrays;

public class AnagramStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Listen";
		String s2 = "Silent";

		boolean flag;
		String str1 = s1.toLowerCase();
		String str2 = s2.toLowerCase();

		char ch[] = str1.toCharArray();
		char ch1[] = str2.toCharArray();

		Arrays.sort(ch);
		Arrays.sort(ch1);

		for (int i = 0; i < str1.length(); i++) {
			if (ch[i] == ch1[i]) {
				flag = true;
			} else {
				flag = false;
			}
		}
	}

}
