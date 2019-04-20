package practice.com;

public class StringManipulations {

	public static void main(String[] args) {
		
		String str="welcome to java";
		String str1="Welcome To Java";
		System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str1.toLowerCase());
		
		System.out.println(str.contains("welcome"));
	
		System.out.println(str.startsWith("welcome"));
		
		System.out.println(str.endsWith("java1"));
		
		System.out.println(str.substring(5));
		
		System.out.println(str.substring(5,10));
		
		System.out.println(str.compareTo(str1));
		String[] split = str.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
		String str2="  dhjsk   ";
		
		System.out.println(str2.trim());
		
		String replaceAll = str.replaceAll(" ", "*");
		
		System.out.println(replaceAll);
		
		String s="venki";
		
		String S1="venki";
		String S2=new String("venki");
		
		String s3=new String("venki");
		
		System.out.println(s.equalsIgnoreCase("venki"));
		
		System.out.println(s.equals(S1));
		
		System.out.println(s == S1);
		
		System.out.println(S2.equals(s3));
		
		System.out.println(S2 == s3);
		
        System.out.println(str.indexOf("welcome"));//0
		
		System.out.println(str.indexOf('m'));//5
		
		System.out.println(str.indexOf('e', 5));
		
		System.out.println(str.indexOf("to", 5));
		
         System.out.println(str.lastIndexOf('a'));
		
		System.out.println(str.lastIndexOf("java"));
		
		String string="welcome to java enjoy";
		
		System.out.println(string.indexOf('e', string.indexOf('e')+1));
		
		System.out.println(string.indexOf('e', string.indexOf('e',string.indexOf('e')+1)+1));
		
		
		
		
		
	}
}
