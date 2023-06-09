
public class Assignment10_Recursion_Q8 {
	
	    public static int countConsonants(String str) {
	        int count = 0;
	        str = str.toLowerCase();

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (isConsonant(ch)) {
	                count++;
	            }
	        }

	        return count;
	    }

	    public static boolean isConsonant(char ch) {
	        return (ch >= 'a' && ch <= 'z') && !isVowel(ch);
	    }

	    public static boolean isVowel(char ch) {
	        ch = Character.toLowerCase(ch);
	        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	    }

	    public static void main(String[] args) {
	        String str = "geeksforgeeks portal";
	        int consonantCount = countConsonants(str);
	        System.out.println("Total consonants: " + consonantCount);
	    }
	}

