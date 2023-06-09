
public class Assignment10_Recursion_Q5 {
	
	    public static int countSubstrings(String str) {
	        int count = 0;
	        int n = str.length();

	       
	        for (int i = 0; i < n; i++) {
	           
	            count++;

	            char currentChar = str.charAt(i);

	           
	            for (int j = i + 1; j < n; j++) {
	                if (str.charAt(j) == currentChar) {
	                    count++;
	                }
	            }
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        String str = "abccba";
	        int count = countSubstrings(str);
	        System.out.println("Number of contiguous substrings: " + count);
	    }
	}

