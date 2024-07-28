import java.util.InputMismatchException;
import java.util.Scanner; // Import the Scanner class

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * this calls the default perfect number function which is fixed between 1 and
         * 200. Normally we would not generally write a fixed method, but this is an
         * example
         */
        Perfectnumber.perfectNumber();
        // Scanner for user input
        Scanner sc = new Scanner(System.in);
        // this bool controls the do while loop to ensure the user enters a valid input
        boolean validInput;
        long number = 0;

        // do while loop to ensure the user enters a valid input
        do {
            System.out.println("Enter an upper range to scan for perfect numbers: ");
            validInput = true;
            try {
                number = sc.nextLong();
                if (number < 1) {
                    System.out.println("Invalid input. Please enter a whole number greater than 0.");
                    validInput = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a whole number greater than 0.");
                validInput = false;
                // this clears the input buffer so we don't go into an infinite loop
                sc.next();
            }
        } while (!validInput);
        // call the perfect number static method
        Perfectnumber.perfectNumber(number);

        // close scanner
        sc.close();
        System.out.println("Thank you for using the perfect number finder!");
    }
}
