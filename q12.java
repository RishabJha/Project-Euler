public class q12 {
    public static void main(String[] args) {
        triangularNumber();
    }

    /**
     * Function Name: triangularNumber
     * 
     * 
     * Inside this function:
     * 1. Calculates the value of the first triangle number to have over five
     * hundred divisors
     */
    private static void triangularNumber() {
        int i, j, counter, max, ans;
        ans = 0;
        max = 0;
        for (i = 1; i < 13000; i++) {
            ans = ans + i;
            counter = 0;
            for (j = 1; j < 1000000; j++) {
                if (ans % j == 0)
                    counter++;
            }
            if (counter > max) {
                max = counter;
            }
            if (counter > 500) {
                System.out.println(ans);
                break;
            }
        }
    }
}
