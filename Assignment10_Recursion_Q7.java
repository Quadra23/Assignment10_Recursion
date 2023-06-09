
public class Assignment10_Recursion_Q7 {
	
	    public static void printPermutations(String str) {
	        printPermutationsHelper(str, "");
	    }

	    private static void printPermutationsHelper(String str, String perm) {
	        if (str.length() == 0) {
	            System.out.print(perm + " ");
	            return;
	        }

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            String remaining = str.substring(0, i) + str.substring(i + 1);
	            printPermutationsHelper(remaining, perm + ch);
	        }
	    }

	    public static void main(String[] args) {
	        String str = "abb";
	        printPermutations(str);
	    }
	}

