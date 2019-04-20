package practice.com;

public class SwapStrings {
 public static void main(String[] args) {
	
	 String str1="java";
	 
	 String str2="welcome";
	 
	 String str3=str1+str2;
	 System.out.println(str3);
	 str2=str3.substring(0,str3.length()-str2.length());
	 System.out.println(str2);
	 str1=str3.substring(str2.length());
      System.out.println(str1);
}
}
