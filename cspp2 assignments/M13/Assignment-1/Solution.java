import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author : 
 */
class Set {
    //your code goes here...
    //Good luck :-)
        private int[] list;
        private int size;
    public Set() {
    	final int a = 30;
    	list = new int[a];
    	size = 0;
    }
    public void add(final int item) {
    	if (size == 0) {
    		list[size++] = item;
    	} else {
	    	for (int i = 0; i < size; i++) {
	    		if (!(contains(item))) {
	    			list[size++] = item;
	    		}
	    	}
    	}
    }
    public int size() {
     	return size;
    }
    public String toString() {
        if (size == 0) {
            return "{}";
        }
        String str = "{";
        int i = 0;
        for (i = 0; i < size - 1; i++) {
            str = str + list[i] + ", ";
        }
        str = str + list[i] + "}";
        return str;
    }
    public boolean contains(final int item) {
        // Replace the code below
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                return true;
            }
            
        }
        return false;
}
    public void add(int[] newArray) {
        // write the logic
        for (int i = 0; i < newArray.length; i++) {
            add(newArray[i]);
        }
    }
    
    public Set intersection(Set S1) {
    	Set newlist = new Set();
    	for(int i=0; i<size; i++) {
            for(int j=0; j < S1.list.length; j++){
                if(list[i] == S1.list[j]) {
                    newlist.add(list[i]);
                }
            }
        }
        return newlist;
    }
        
    public Set retainAll(int[] newarray) {
    	Set none = new Set();
    	for(int i=0;i<size; i++) {
            for(int j : newarray){
                if(j == list[i]) {
                    none.add(list[i]);
                }
                
            }
        }
        return none;
    }
    public int[][] cartesianProduct(Set t) {
    	if (size == 0 || t.size() == 0) {
    		return null;
    	}
    	int[][] arr = new int[size * t.size()][2];
    	int k = 0;
    	for (int i = 0;i < size;i++) {
    		for (int j = 0; j<t.size();j++) {
    			arr[k][0] = list[i];
    			arr[k++][1] = t.list[i];
    		}
    	}
    	return arr;
    }
}
/**
 * Solution class for code-eval.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        Set s = new Set();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "size":
                System.out.println(s.size());
                break;
                case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
                case "print":
                System.out.println(s);
                break;
                case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
                case "intersection":
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
                case "retainAll":
                s = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
                /**
                case "cartesianProduct":
                s = new Set();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;**/
                default:
                break;
            }
        }
    }
}


 

