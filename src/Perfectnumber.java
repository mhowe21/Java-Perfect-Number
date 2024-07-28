
// sources https://www.geeksforgeeks.org/measure-time-taken-function-java/
// sources https://www.geeksforgeeks.org/perfect-number/

public class Perfectnumber {

    private static void perfectNumberLoop(long number) {
        int perfectNumberCount = 0;
        for (long i = 1; i <= number; i++) {
            long sum = 0;
            for (long j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i);
                perfectNumberCount++;
            }
        }
        if (perfectNumberCount == 0) {
            System.out.println("No perfect numbers found between 1 and " + number);
        }
    }

    /**
     * This method calculates the perfect number between 1 and 200 as an example of
     * the process
     */
    public static void perfectNumber() {
        // inner loop covers numbers from 1 to 200 and iterates for each number
        System.out.println("the perfect numbers between 1 and 200 are: ");
        perfectNumberLoop(200);
    }

    /**
     * This method calculates the perfect number between 1 and the number passed in,
     * measures the time it takes to execute, and prints the results
     * 
     * @param number
     */
    public static void perfectNumber(long number) {
        System.out.println("Running... Note larger numbers take longer to run");
        System.out.println("the perfect numbers between 1 and " + number + " are: ");
        // get the start time to measure the performance of the loop
        double startTime = System.currentTimeMillis();
        perfectNumberLoop(number);
        // get the end time to measure the performance of the loop
        double endTime = System.currentTimeMillis();
        // output the time taken for the loop to run
        System.out.println("Time taken: " + ((endTime - startTime) / 1000) + " seconds");

        System.out.println("Done!");
    }

}
