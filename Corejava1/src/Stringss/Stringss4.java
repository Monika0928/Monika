package Stringss;

public class Stringss4 {

	public static void main(String[] args) {

		String s="i love working at Home and Company";
//		int count=0;             //1. count each word 
//		String[] var = s.split(" ");                                                   
//		for(int i=0; i<var.length;i++) 
//		{
//				count++;
//		}
//		System.out.println(count);                       
//		***********************************************************************************************************	
		                                         //2. count only 'a' alphabet
//		int count=0;
//		for (int i =0; i<s.length(); i++) {
//		char var = s.charAt(i);
//		if(var=='a' || var=='A') {
//		count++;
//		}      
//		}
//		System.out.println(count);
//			
//*********************************************************************************************************************			
			int count=0;             //3. count of each letters                                                   
				for(int i=0; i<s.length();i++) {
					count++;
				}
			System.out.println(count);                       
//			
//	*******************************************************************************************************************		
//			 char a = 'a'; // Start from 'a'                             //4. count each alphabet
//		     for (int i = 0; i < 26; i++) {   // for char
//		         int count1 = 0;
//		         for (int j = 0; j < s.length(); j++) {   
//		             if (Character.toLowerCase(s.charAt(j)) == a) { // Convert to lowercase for comparison
//		                 count++;
//		             }
//		         }
//		         if (count > 0) {
//		             System.out.println(a + "_" + count);
//		         }
//		         a++; // Move to the next character in the alphabet  
//		     }
			
//************************************************************************************************************************			     	
			                                     //4 count each alphabet for 1 word i -1, love-4, working- 7, at-2, home-4
//		     String[] words = s.split(" ");
//		     for (int j = 0; j < words.length; j++) {
//		    	    String word = words[j];
//		    	    int count = 0;
		//
//		    	    for (int i = 0; i < word.length(); i++) {
//		    	        if (Character.isLetterOrDigit(word.charAt(i))) {
//		    	            count++;
//		    	        }
//		    	    }
		//
//		    	    System.out.println(word + " - " + count);
//		     }}}
			                                                                           //5. write in min/max
		     
//		    String[] words = s.split(" ");  
//		    String maxAlphabetWord = "";
//		    int maxAlphabets = 0;
		//
//		    for (String word : words) {
//		        int alphabetCount = countAlphabets(word)
		;
//		        if (alphabetCount > maxAlphabets) {
//		            maxAlphabets = alphabetCount;
//		            maxAlphabetWord = word;
//		        }
//		    }
		//
//		    System.out.println("Word with the maximum number of alphabets: " + maxAlphabetWord);
		//  }
		//
		// Function to count the number of alphabets in a word
		//   public static int countAlphabets(String word) {
//		    int count = 0;
//		    for (int i = 0; i < word.length(); i++) {
//		      if (Character.isLetter(word.charAt(i))) {
//		          count++;
//		      }
//		    }
//		    return count;
		//
			
			
		                                                                                   //6.count duplicate value	
//			 char[] words = s.toCharArray();
//		     boolean[] printed = new boolean[256]; 
//		     for (int i = 0; i < words.length; i++) {
//		         int count = 1; 
//		        
//		     for (int j = i + 1; j < words.length; j++) {
//		                 if (words[i] == words[j]&& !printed[words[i]]) {
//		                     count++;
//		                 }
//		             }
//		             if (count > 1) {
//		                 System.out.println(words[i] + " : " + count + " times");
//		             }
//		             printed[words[i]] = true;
		         
		//}	


	}

}
