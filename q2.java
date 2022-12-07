public class q2 {
    public static void main(String[] args) {
        int sum = sumFibonacci();
        System.out.println("The sum of the even-valued terms, whose values do not exceed four million is " + sum);
    }

    /**
     * Function name: sumFibonacci
     * 
     * @return
     * 
     *         Inside this function:
     *         1. Generates sum of even valued terms, whose value doesnot exceed
     *         40lakhs
     *         2. Returns the sum
     */
    private static int sumFibonacci() {
        int sum = 0;
        int x = 1;
        int y = 2;
        while (x <= 4000000) {
            if (x % 2 == 0)
                sum += x;
            int z = x + y;
            x = y;
            y = z;
        }
        return sum;
    }
}
