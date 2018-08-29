
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {
/* Fill the main function to print the number of 7's between 1 to n*/
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        int n = s.nextInt();
        int c=0, k;
        for (int i=1;i<=n;i++) {
        	int j = i;
        	while (j>0) {
        	k=j%10;
        	if (k==7 ) {
        		c=c+1;
        	}
        	j=j/10;
        }

        }
       
        System.out.println(c);
      }
        
       
        
    }