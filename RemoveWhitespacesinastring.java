package practice.com;

public class RemoveWhitespacesinastring {

	public static void main(String[] args) {
		
		
		String str="welcome to java";
		System.out.println(str.replaceAll(" ", ""));
		String s = "";
	
		StringBuffer sb1=new StringBuffer();
		
		char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++)
        {
            int temp = arr[i];
            if(temp!=32 && temp!=9)
            { // 32 ASCII for space and 9 is for Tab
                s+=arr[i];
              
            }    
        }
       System.out.println(s);
       for (int i = 0; i < arr.length; i++)
       {
           int temp = arr[i];
           if(temp!=32 && temp!=9)
           { // 32 ASCII for space and 9 is for Tab
               
              sb1.append(String.valueOf(arr[i])); 
           }    
       }
       System.out.println(sb1);
       
       String s1="";
       for (int i = 0; i < arr.length; i++)
       {
          
           if(arr[i]!=' ')
           { 
        	   s1+=arr[i];
               
              
           }    
       }
       System.out.println(s1);
        
        
        String withSpace = "Remove white space from line";
        StringBuilder removeSpace = new StringBuilder();

        for (int i = 0; i<withSpace.length();i++)
        {
            if(!Character.isWhitespace(withSpace.charAt(i))){
                removeSpace=removeSpace.append(withSpace.charAt(i));
                
            }
        }
        System.out.println(removeSpace);
	}
}
