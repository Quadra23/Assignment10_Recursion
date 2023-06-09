
public class Assignment10_Recursion_Q1 {
	
	    public static boolean isPowerOfThree(int n) {
	        if (n <= 0) {
	            return false;
	        }
	        
	        while (n % 3 == 0) {
	            n /= 3;
	        }
	        
	        return n == 1;
	    }
	    
	    public static void main(String[] args) {
	        int num1 = 27;
	        System.out.println(num1 + " is a power of three? " + isPowerOfThree(num1));
	        
	        int num2 = 0;
	        System.out.println(num2 + " is a power of three? " + isPowerOfThree(num2));
	    }
	}

