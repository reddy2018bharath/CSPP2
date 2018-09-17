import java.util.Scanner;

/**
 * Solution class for code-eval.
 */
public final class Solution {
     /**
     * Constructs the object.
     */
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
         // instantiate this Quiz
        Quiz q = new Quiz();
         // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
             // split the line using space
            String[] tokens = line.split(" ");
              // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                lq(s, q, Integer.parseInt(tokens[1]));
                break;
                case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
                case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore(q);
                break;
                default:
                break;
            }
        }
    }
    /**
     * Class for quiz.
     */
    static class Quiz {
    	public Quiz() {

    	}

    }
    /**
     * Loads questions.
     *
     * @param      s              The scanner object for user input
     * @param      q           The quiz object
     * @param      qc  The question count
     */
    public static void lq(final Scanner s, final Quiz q, final int qc) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
        //System.out.println(questionCount);
        if (qc == 0) {
        System.out.println("Quiz does not have questions");
    } else {
    	 int a = 0;
    	for (a = 0; a < qc; a++) {
    		 String line = s.nextLine();
    		 String[] tokens = line.split(":");
    		 //System.out.println(tokens);
    		 final int c = 5;
    		 for (int i = 0; i < c; i++) {
    		 	if (tokens[i].length() == 0) {
    		 		System.out.println("Error! Malformed question");
    		 	}
    		 }
    		// final int d = 4;
    		 System.out.println(tokens.length);
    		 if (tokens.length != 5) {
    		 	System.out.println("Error! Malformed question");
    		 }
    		 final int e = 3;
    		 if (Integer.parseInt(tokens[e]) <= 0) {
    		 	System.out.println("Invalid max marks for"+ " " + tokens[0]);
    		 }
    		 if (Integer.parseInt(tokens[4]) > 0) {
    		 	System.out.println("Invalid penalty for"+ " " + tokens[0]);
    		 }
    		 String[] array = tokens[1].split(",");
    		 //System.out.println(array.length);
    		 if(array.length < 2) {
    		 	System.out.println(tokens[0] + " " + "does not have enough answer choices");
    		 }
    		 if (array.length >=2 && Integer.parseInt(tokens[2]) > 4 || Integer.parseInt(tokens[2]) < 1) {
    		 	System.out.println("Error! Correct answer choice number is out of range for" + " " + tokens[0]);
    		 }
    		 
    }

    
    	}
        
    }

    /**
     * Starts a quiz.
     *
     * @param      s            The scanner object for user input
     * @param      quiz         The quiz object
     * @param      answerCount  The answer count
     */
    public static void startQuiz(final Scanner s, final Quiz quiz, final int answerCount) {
        // write your code here to display the quiz questions
        // read the user responses from the console
        // store the user respones in the quiz object
    }

    /**
     * Displays the score report
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report
    }
}
