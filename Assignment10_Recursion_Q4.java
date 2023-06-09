
public class Assignment10_Recursion_Q4 {
	
	    public static int calculateLength(String str) {
	        if (str.isEmpty()) {
	            return 0;
	        }
	        return 1 + calculateLength(str.substring(1));
	    }

	    public static void main(String[] args) {
	        String str = "Hello, World!";
	        int length = calculateLength(str);
	        System.out.println("Length of the string \"" + str + "\" is: " + length);
	    }
	}

