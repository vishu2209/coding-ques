package dsa.arrayAndString;

public class ReverseString {
	
	public static String StringReverse(String str) {
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			char chr = str.charAt(i);
			str1 = str1+chr;
		}
		return str1;
	}
	
	public static void main(String[] args) {
		String str = "vishal";
		String str2 = StringReverse(str);
		System.out.println(str2);
	}

}
