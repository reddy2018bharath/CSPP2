import java.util.Scanner;
import java.util.Arrays;

/**
  * write your code below this comment
  */
class Task {
    String title;
    String assignedTo; 
    int timeToComplete; 
    boolean important;
    boolean urgent; 
    String status;
    Task(String title, String assignedTo, int timeToComplete, boolean important, boolean urgent, String status) {
        this.title = title;
        this.assignedTo = assignedTo;
        this.timeToComplete = timeToComplete;
        this.important = important;
        this.urgent = urgent;
        this.status = status;
    }
    public String gettitle() {
        return this.title;
    }
    public String getassignedTo() {
        return this.assignedTo;
    }
    public int gettimeToComplete() {
        return this.timeToComplete;
    }
    public String getimportant() {
        if (this.important == true) {
            return "Important";
        }
        return "Not Important";
    }
    public String geturgent() {
        if (this.urgent == true) {
            return "Urgent";
        }
        return "Not Urgent";
    }
    public String getstatus() {
        return this.status;
    }
    /*public String toString() {
        Task t = new Task();
    }*/
    public String toString() 
    { if (gettitle().length() == 0) {
        return "Title not provided";
    }
    if (gettimeToComplete() <0) {
        return "Invalid timeToComplete" +" "+ gettimeToComplete();
    } if (getstatus().length() != 4) {
        return "Invalid status" + " "+getstatus();
    }
    else {
        return gettitle() +","+ " " + getassignedTo() +","+ " " + gettimeToComplete() +","+ " " + getimportant() +","+ " " + geturgent()+","+ " " + getstatus();
    }
}
    
    }

class Todoist {
    public Todoist() {

    }

}

/**
 * Class for todoist main.
 */
public class TodoistMain {

    /**
     * Starts a test.
     */
    public static void startTest() {
        Todoist todo = new Todoist();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(",");
            switch (tokens[0]) {
                case "task":
                    testTask(tokens);
                break;
                /*case "add-task":
                    testAddTask(todo, tokens);
                break;
                case "print-todoist":
                    System.out.println(todo);
                break;
                case "get-next":
                    System.out.println(todo.getNextTask(tokens[1]));
                break;
                case "get-next-n":
                    int n = Integer.parseInt(tokens[2]);
                    Task[] tasks = todo.getNextTask(tokens[1], n);
                    System.out.println(Arrays.deepToString(tasks));
                break;
                case "total-time":
                    System.out.println(todo.totalTime4Completion());
                break;*/
                default:
                break;
            }
        }
    }

    /**
     * method to test add task.
     *
     * @param      todo    The todo
     * @param      tokens  The tokens
     */
    /*public static void testAddTask(final Todoist todo, final String[] tokens) {
        try {
            todo.addTask(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }*/

    /**
     * method to test the creation of task object.
     *
     * @param      tokens  The tokens
     */
    public static void testTask(final String[] tokens) {
        try {
            System.out.println(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Creates a task object.
     *
     * @param      tokens     The tokens
     *
     * @return     Task object
     *
     * @throws     Exception  if task inputs are invalid
     */
    public static Task createTask(final String[] tokens) throws Exception {
        String title = tokens[1];
        String assignedTo = tokens[2];
        int timeToComplete = Integer.parseInt(tokens[3]);
        boolean important = tokens[4].equals("y");
        boolean urgent = tokens[5].equals("y");
        String status = tokens[6];
        return new Task(
            title, assignedTo, timeToComplete, important, urgent, status);
    }
    

    /**
     * main method.
     *
     * @param      args  The command line arguments
     */
    public static void main(final String[] args) {
        startTest();
    }
}
