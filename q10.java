public class q10 {
    public static void main(String[] args) {
        calcPrime();
    }

    /**
     * Function Name: calcPrime
     * 
     * 
     * Inside this function:
     * 1.sum of all the primes below two million.
     */
    private static void calcPrime() {
        int sum = 0;
        for (int i = 1; i < 2000000; i++) {
            if (isPrime(i)) {
                sum = sum + i;
            }
        }
        System.out.println("Sum is " + sum);
    }

    /**
     * Function Name: isPrime
     * 
     * @param n
     * @return
     * 
     *         Inside this function:
     *         1. Checks if the given number is a prime numbers
     *         2. Returns the answer in boolean form
     */
    private static boolean isPrime(int n) {
        if (n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i++) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
}
