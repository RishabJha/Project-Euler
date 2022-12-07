import java.util.Arrays;

public class q4 {
    public static void main(String[] args) {
        boolean value = false;
        int n = 999;
        int result = 0;
        while (value == false) {
            result = n * 999;
            value = isPlaindrome(result);
            n--;
        }
        System.out.println(result);
    }

    /**
     * Function Name: isPalindrome
     * 
     * @param result
     * @return
     * 
     * Inside this function:
     * 1.Stores the number into array
     * 2.Reverses the array
     * 3. Checks if both the arrays are equal
     */
    private static boolean isPlaindrome(int result) {
        int b = Integer.valueOf(result).toString().length() - 1;
        char[] array = new char[Integer.valueOf(result).toString().length()];
        char[] reverse = new char[Integer.valueOf(result).toString().length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.valueOf(result).toString().charAt(i);
        }

        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[b];
            b--;
        }

        if (Arrays.equals(array, reverse)) {
            return true;
        }
        return false;
    }
}
