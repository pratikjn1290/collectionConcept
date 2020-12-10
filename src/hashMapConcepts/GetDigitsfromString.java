package hashMapConcepts;

public class GetDigitsfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello1233324344";

		char ch[] = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (Character c : ch) {
			if (!Character.isDigit(c)) {
				sb.append(c);
			}
		}

		System.out.println(sb.toString());

	}

}