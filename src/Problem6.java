/**
 Problem 6: Sum Square Difference
 ---
 The sum of the squares of the first ten natural numbers is,

 12 + 22 + ... + 102 = 385
 The square of the sum of the first ten natural numbers is,

 (1 + 2 + ... + 10)2 = 552 = 3025
 Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

 Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 ---

 @author Travis Stratton
 */
public class Problem6 {


    /*
        [ 1/2 * (n * (n+1)) ] ^ 2   Square of sum

        [ n / 6 * (n + 1) * (2^2+1) ]    Sum of the Squares

     */

    public static void main(String ... args) {
        int numTerms = 100;

        int squareOfSum = (int) Math.pow(((numTerms * (numTerms+1)) / 2), 2);
        int sumOfSquare = numTerms * (numTerms + 1) * (2 * numTerms + 1) / 6;
        System.out.println(String.format("The difference between the sum of the squares of the first %d natural numbers" +
                "and the square of the sum is: %d - %d = %d", numTerms, squareOfSum, sumOfSquare, (squareOfSum - sumOfSquare)));

    }
}
