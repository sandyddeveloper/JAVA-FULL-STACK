package Basic;

public class NoOfCharPresentInTheString {
	public static void main(String[] args) {
		String str = "JavaProgramming";
		int count = 0;
		
		for(int i = 0; i<str.length(); i++) {
			count++;
		}
		
		System.out.println("The countn of the given String is : "+count);
	}

}
