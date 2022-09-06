import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string1:");
		String str1 = scanner.nextLine();
	
		System.out.println("Enter string2:");
		String str2 = scanner.nextLine();
		
//		String str1 = "srrr";
//		String str2 = "srrrr";
		
		String string1 = str1.toString().toLowerCase();
		String string2 = str2.toString().toLowerCase();
		
		boolean ifAnagram = checkIfAnagram(string1,string2);
		
		System.out.println(ifAnagram);
		

	}

	private static boolean checkIfAnagram(String string1, String string2) {
		
		if(string1.length() == string2.length()) {
			char[] charArr1 = string1.toCharArray();
			char[] charArr2 = string2.toCharArray();
			
			Arrays.sort(charArr1);
			Arrays.sort(charArr2);
			
			if(Arrays.equals(charArr1, charArr2)) {
				return true;
			}
		}
		
		return false;
		// TODO Auto-generated method stub
		
	}

}
