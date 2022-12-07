public class q1 {
    public static void main(String[] args) {
        int sum = sumMultiple();
        System.out.println("Sum of all the multiples of 3 or 5 below 1000 is " + sum);
    }

    /**
     * Function Name: sumMultiple
     * 
     * @return
     * 
     *         Inside this function:
     *         1.Generates sum of all the multiples of 3 or 5 below 1000
     *         2. Returns the sum
     */
    private static int sumMultiple() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if ((i % 3) == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}