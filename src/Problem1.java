/**
    Problem 1: Multiples of 3 and 5
    ---
    If we list all the natural numbers below 10 that are multiples of 3 or 5,
    we get 3, 5, 6 and 9. The sum of these multiples is 23.

    Find the sum of all the multiples of 3 or 5 below 1000.
    ---

    @author Travis Stratton
 */
public class Problem1 {
    public static void main(String... args) {

        // Brute force method (simple, O(n) complexity)
        int sum = 0;
        int upperLimit = 999;  // making inclusive for second method
        for (int i = 2; i <= upperLimit; i++) {
            if (i % 3 == 0 || i %5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        // Mathematical solution with Asthmatic Progression
        /*
            x = a + (n-1)d
            a = initial value
            x = last value
            d = common difference
            n = number of terms

            n = (-a + d + x) / d
            a = d, therefore n = x/d
                (in our case, X/D = 999/3 for example)
            x = d + ((x/d)-1)d, reduced to
                x = d * (x / d)
            using the formula (n/2) * (a + x)... we get

            Sum = (x/d)/2 * (d + d * (x/d), reduced to
            Sum = d * x/d * (1+(x/d))/2

            Using this formula, we can get the sums of all multiples of 3, 5, and 15 respectively.
            Since 15 is the least common multiple of 3, and 5, we can use this to remove terms that were
            double counted.
        */
        int divisby3 = 3 * (upperLimit/3) * (1 + upperLimit/3) / 2;
        int divisby5 = 5 * (upperLimit/5) * (1 + upperLimit/5) / 2;
        int divisby15 = 15 * (upperLimit/15) * (1 + upperLimit/15) / 2;

        sum = divisby3 + divisby5 - divisby15;
        System.out.println(sum);
    }
}
