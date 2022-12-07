public class q9 {
    public static void main(String[] args) {
        int n = 1000;
        pythagoreanTriplet(n);
    }

    /**
     * Function Name: pythagoreanTriplet
     * 
     * @param n
     * 
     *          Inside this function:
     *          1.Calculate pythagorean triplet for which a + b + c = 1000
     */
    private static void pythagoreanTriplet(int n) {
        for (int i = 1; i <= n / 3; i++) {
            for (int j = i + 1; j <= n / 2; j++) {
                int k = n - i - j;
                if (i * i + j * j == k * k) {
                    System.out.print(i + ", " +
                            j + ", " + k);
                    return;
                }
            }
        }
    }
}
