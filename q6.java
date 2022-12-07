public class q6 {
    public static void main(String[] args) {
        sumSquareDifference();
    }

    /**
     * Function Name: sumSquareDifference
     * 
     * 
     * Inside this function:
     * 1.Calculate sum of the squares of first hundred natural number
     * 2.Calculate the square of the sum of first hundred natural number
     * 3.Calculate the difference between the sum of the squares of first hundred
     * natural number and the square of the sum of the first hundred natural numbers
     */
    private static void sumSquareDifference() {
        int sumSquare = 0;
        for (int i = 1; i <= 100; i++) {
            sumSquare = sumSquare + (int) (Math.pow(i, 2));
        }
        System.out.println("Sum of the squares " + sumSquare);

        int squareSum = 0;
        for (int i = 1; i <= 100; i++) {
            squareSum += i;
        }
        squareSum = (int) (Math.pow(squareSum, 2));
        System.out.println("Square of the sum " + squareSum);

        int difference = squareSum - sumSquare;
        System.out.println("Difference is " + difference);
    }
}
