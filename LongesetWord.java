package Arrays;

import java.util.Scanner;

public class LongesetWord {
	 public static String LongestWord(String sen) {
		    String word="";
		    sen = sen.replaceAll("\\p{Punct}","");
		    sen=sen.replaceAll("\\d","");
		    String[] str= sen.split(" ");
		    int[] len= new int[str.length];
		    
		    if(str.length>1) {
		    	for(int i=0; i<str.length;i++) {
			    	len[i]=str[i].length();
			    }
		    	
		    	for(int i=1; i<len.length; i++) {
		    		if(len[i-1]>=len[i])
		    			word=str[i-1];
		    		else {
		    			word=str[i];
		    		}
		    	}
		    }
		    return word;
		  }

		  public static void main (String[] args) {  
		    // keep this function call here     
		    Scanner s = new Scanner(System.in);
		    System.out.print(LongestWord(s.nextLine())); 
		  }

}
