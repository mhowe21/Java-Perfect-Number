import java.util.Scanner; // Import the Scanner class

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * this calls the default perfect number function which is fixed between 1 and
         * 200. Normally we would not generally write a fixed method, but this is an
         * example
         */
        Perfectnumber.perfectNumber();

        // varable for validation of user input
        long number = 0;

        // Scanner for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an upper range to scan for perfect numbers: ");
        number = sc.nextLong();
        Perfectnumber.perfectNumber(number);

        sc.close();
        System.out.println("Thank you for using the perfect number finder!");
    }

    public boolean validateInput(long number) {
        if (number <= 1) {
            return true;
        } else {
            return false;
        }
    }
}
