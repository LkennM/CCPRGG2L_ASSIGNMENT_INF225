import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        drive("pass ");
        scan.close();
    }

    static void drive(String food) {

        System.out.println("Driving School");
        taste(food);

        String feedback = getFeedBack(food);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            Driving(food);

            // Recursive call
            drive(food);
        } else if (feedback.equals("yes")) {
            pass(food);
        }
    }

    static void taste(String food) {
        System.out.println("taking the the driving exam ");
    }

    static String getFeedBack(String passed) {
        System.out.println("Did you " + passed+ "the test ? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void Driving(String passed) {
        System.out.print("Retake the exam :");
        String ingredient = scan.next();
        System.out.println("Failed");
    }

    static void pass(String passed) {
        System.out.println("I passed the exam");
    }
}
