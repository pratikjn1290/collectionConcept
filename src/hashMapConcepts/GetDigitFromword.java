package hashMapConcepts;

public class GetDigitFromword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello 123 How 12334 Hi 12345";

		String[] arr = s.split(" ");

		for (String arr1 : arr) {
			if (arr1.matches("\\d*")) {
				System.out.println(arr1);
			}
		}

	
	
	String s1 = "Hello123";
	
	char ch[] = s1.toCharArray();
	StringBuilder sb = new StringBuilder();
	
	for(Character c : ch)
	{
		if(!Character.isDigit(c))
		{
			sb = sb.append(c);
		}
	}
	
	System.out.println(sb.toString());
	}	

}
