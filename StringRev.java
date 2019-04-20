package practice.com;

public class StringRev 
{
	public static void main(String[] args)
	{
		//1st method
		
	    String str="welcome to java";
	    
	    String[] splstr = str.split(" ");
	    
	    
	    String rev="";
	  for (int i = splstr.length-1; i>=0; i--) 
	  {
		rev=rev+splstr[i]+" ";
	  }
	  
	  System.out.println(rev);
	
	//2nd method
	StringBuffer sb=new StringBuffer(str);
	
	String string = sb.reverse().toString();
	
	System.out.println(string);
	
	//3rd method
	
	String revere="";
	 for (int j = str.length()-1; j>=0; j--) 
	  {
		revere=revere+str.charAt(j);
	  }
	
	 System.out.println(revere);
	 
	 
	 
	 
	 //4th method
	 String reverse="";
	 String[] splitstring = str.split(" ");
	 
	 for (int i = 0; i < splitstring.length; i++)
	 {
		
		 String getstr = splitstring[i];
		 
		 for (int j =getstr.length()-1; j>=0; j--) 
		 {
			  reverse=reverse+getstr.charAt(j);
		 }
		
		 reverse=reverse+" ";
		
	}
	 
	 System.out.println(reverse);
	}
}
