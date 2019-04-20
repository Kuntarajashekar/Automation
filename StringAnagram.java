package practice.com;

import java.util.Arrays;

public class StringAnagram {
public static void main(String[] args) {
	
	String str1="venki";
	
	String str2="iknve";
	
	char[] ch = str1.toCharArray();
	
	char[] ch1 = str2.toCharArray();
	
	Arrays.sort(ch1);
	Arrays.sort(ch);
	
	System.out.println(Arrays.equals(ch, ch1));
	
}
}
