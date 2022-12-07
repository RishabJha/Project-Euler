public class q7 {

    public static void main(String[] args) {
        System.out.println(nthPrime(10001));
    }

    /**
     * Function Name: nthPrime
     * 
     * @param n
     * @return
     * 
     *         Inside this function:
     *         1. Calculate the nth prime no
     *         2. Returns the same
     */
    public static long nthPrime(long n) {
        int numberOfPrimes = 0;
        long prime = 1;
        while (numberOfPrimes < n) {
            prime++;
            if (isPrime(prime)) {
                numberOfPrimes++;
            }
        }
        return prime;
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
    public static boolean isPrime(long n) {
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