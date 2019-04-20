package practice.com;

public class StringPalindrome {

	public static void main(String[] args) {
		
		
		String str="mam";
		String temp="mam";
		String rev="";
		for (int i =str.length()-1; i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(rev.equals(temp))
		{
			System.out.println(rev+" is a palindrome");
		}
	}
}
