
public class Assignment10_Recursion_Q2 {
	
	    public static int lastRemaining(int n) {
	        boolean leftToRight = true;
	        int remaining = n;
	        int step = 1;
	        int head = 1;
	        
	        while (remaining > 1) {
	            if (leftToRight || remaining % 2 == 1) {
	                head += step;
	            }
	            
	            remaining /= 2;
	            step *= 2;
	            leftToRight = !leftToRight;
	        }
	        
	        return head;
	    }
	    
	    public static void main(String[] args) {
	        int num1 = 9;
	        System.out.println("Last remaining number for n = " + num1 + ": " + lastRemaining(num1));
	        
	        int num2 = 5;
	        System.out.println("Last remaining number for n = " + num2 + ": " + lastRemaining(num2));
	    }
	}

