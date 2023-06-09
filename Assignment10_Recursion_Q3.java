
public class Assignment10_Recursion_Q3 {
	
	    public static void printSubsets(String set) {
	        printSubsetsRecursive(set, "", 0);
	    }
	    
	    private static void printSubsetsRecursive(String set, String subset, int index) {
	        if (index == set.length()) {
	            System.out.print("\"" + subset + "\", ");
	            return;
	        }
	        
	        printSubsetsRecursive(set, subset, index + 1);
	        printSubsetsRecursive(set, subset + set.charAt(index), index + 1);
	    }
	    
	    public static void main(String[] args) {
	        String set1 = "abc";
	        System.out.println("Subsets of \"" + set1 + "\":");
	        printSubsets(set1);
	        
	        String set2 = "abcd";
	        System.out.println("\nSubsets of \"" + set2 + "\":");
	        printSubsets(set2);
	    }
	}

