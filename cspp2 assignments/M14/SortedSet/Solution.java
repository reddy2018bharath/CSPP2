/**
 * { item_description }.
 */
import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for sorted set.
 */
class SortedSet extends Set {
/**
 * Constructs the object.
 */
 SortedSet() {

    }
/**
 * { function to return the subset array }.
 *
 * @param      fromElement  The from element
 * @param      toElement    To element
 *
 * @return     { return value is of type integer array}
 */
    public int[] subSet(final int fromElement, final int toElement) {
        final int h = 10;
        int[] array = new int[h];
        if (fromElement > toElement) {
            System.out.println("Invalid Arguments to Subset Exception");
            return null;
        }
        int count = 0;
        for (int i = 0, j = 0; i < size; i++) {
            if (set[i] >= fromElement && set[i] < toElement) {
                array[j++] = set[i];
                count++;
            }
        }
        return Arrays.copyOf(array, count);
    }
/**
 * { function to the return integer array before the element }.
 *
 * @param      toElement  To element
 *
 * @return     { the return value is of the integer array}
 */
    public int[] headSet(final int toElement) {
        final int g = 10;
        int[] arr = new int[g];
        int count = 0;
        for (int i = 0, j = 0; i < size; i++) {
            if (set[i] < toElement) {
                arr[j++] = set[i];
                count++;
            }
        }
        return Arrays.copyOf(arr, count);
    }
/**
 * { function to print last item in the set}.
 *
 * @return     { return value is of the type int}
 */
    public int last() {
        if (size != 0) {
            return set[size - 1];
        }
        System.out.println("Set Empty Exception");
        return -1;
    }
/**
 * Adds all.
 *
 * @param      ar    The archive
 */
    public void addAll(final int[] ar) {
        for (int i: ar) {
            add(i);
        }
    }
    @Override
/**
 * { function to add the elements and sorting the set.}
 *
 * @param      element  The element
 */
    public void add(final int element) {
        int index = 0;
        int i;
        if (!(contains(element))) {
            for (i = 0; i < size; i++) {
                if (set[i] > element) {
                    index = i;
                    break;
                }

            }
            if (i == size) {
                index = i;
            }
            for (int j = size; j > index; j--) {
                set[j] = set[j - 1];
            }
            set[index] = element;
            size++;
        }
    }
}
/**
 * { item_description }.
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
        if (input.equals("{}")) {
            return new int[0];
        }
        if (s.contains("{")) {
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
        SortedSet s = new SortedSet();
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
                // case "contains":
                // System.out.println(s.contains(Integer.parseInt(tokens[1])));
                // break;
                case "print":
                System.out.println(s);
                break;
                case "addAll":
                if (tokens.length == 2) {
                        String[] t1 = tokens[1].split(",");
                        int[] temp = new int[t1.length];
                        for (int i = 0; i < temp.length; i++) {
                            temp[i] = Integer.parseInt(t1[i]);
                        }
                        s.addAll(temp);
                    }
                break;
                case "subSet":
                    if (tokens.length != 2) {
                        break;
                    }
                    String[] arrstring3 = tokens[1].split(",");
                    int[] tmp =s.subSet(Integer.parseInt(arrstring3[0]),
                        Integer.parseInt(arrstring3[1]));
                    if (tmp != null) {
                        System.out.println(Arrays.toString(tmp).replace("[","{").replace("]","}"));
                    }
                break;
                case "headSet":
                    System.out.println(Arrays.toString(s.headSet(Integer.parseInt(tokens[1]))).replace("[","{").replace("]","}"));
                break;
                case "last":
                System.out.println(s.last());
                break;
                case "add":
                    String[] t = tokens[1].split(",");
                    s.add(Integer.parseInt(tokens[1]));
                break;
                default:
                break;
            }
        }
    }
}