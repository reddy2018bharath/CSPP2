import java.util.Scanner;
/**
 * Write a java program to find the odd composite numbers
 * between 2 and n where n is given as an input.
 *
 * @author : 
 */
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution() {
        //not used
    }
    /**
     * Prints the odd composite numbers between 2 and n.
     *
     * @param      n     n value
     */
    static void oddComposites(final int n) {

    	
    	for (int i = 2; i < n; i++) {
    		int count1 = 0;
    		int count2;
    		if (n%i == 0) {
    			 count1 += 1;
    		
    		if (i % 2 != 0) {
    			 count2 = 1;
            
            if (count1 !=1  && count2 == 1) {
            	System.out.println(i);

            }
        }
    }
    		
    		
          
          
          		
          	}
          }

    	
	// write your code here
    
    /**
    * main method as driver program.
    * @param args is the parameter for this method
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        oddComposites(n);
      
    }
}

