public class q3 {
    public static void main(String[] args) {
        long n = 600851475143L;
        long result = calcPrime(n);
        System.out.println("Largest prime number is " + result);
    }

    /**
     * Function Name: calc Prime
     * 
     * @param n
     * @return
     * 
     * Inside this function:
     * 1. Calculate the largest prime of n
     * 2. Returns the largest prime
     */
    private static long calcPrime(long n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                n = n / i;
            }
        }
        return n;
    }
}
