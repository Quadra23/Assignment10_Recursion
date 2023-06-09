
public class Assignment10_Recursion_Q6 {
	
	    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
	        if (n == 1) {
	            System.out.println("move disk 1 from rod " + source + " to rod " + destination);
	            return;
	        }

	        towerOfHanoi(n - 1, source, destination, auxiliary);
	        System.out.println("move disk " + n + " from rod " + source + " to rod " + destination);
	        towerOfHanoi(n - 1, auxiliary, source, destination);
	    }

	    public static int countMoves(int n) {
	        return (int) Math.pow(2, n) - 1;
	    }

	    public static void main(String[] args) {
	        int n = 3;
	        towerOfHanoi(n, '1', '2', '3');
	        int moves = countMoves(n);
	        System.out.println("Total moves: " + moves);
	    }
	}

