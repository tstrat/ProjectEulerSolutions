import java.util.ArrayList;

/**
 Problem 10: Summation of Primes
 ---

 The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

 Find the sum of all the primes below two million.
 ---

 @author Travis Stratton
 */
public class Problem10 {
    /*
    Kind of solved this in a previous problem.  I'm going to reuse that solution and modify it for this.
    From Problem 7:
     */
    public static void main(String ... args) {
        int terms = 2000000;
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);  // get 2 in there so our loop can only check for odds
        for (int i = 3; i < terms; i += 2) {
            boolean prime = true;
            for (int k : primes) {
                if (i % k == 0) {
                    prime = false;
                    break;
                }
                    /* THIS SAVES TIME! Don't bother checking above SQRT for PRIMES!!! */
                if (k >= Math.sqrt(i)) {
                    break;
                }
            }
            if (prime) {
                primes.add(i);
            }
        }

        /*
            Now stored in our primes array are all the primes less than our term count. We just have to add them up
         */

        long sum = 0;
        for(int prime: primes) {
            sum += prime;
        }
        System.out.println(String.format("The sum of all the primes below %d is: %d", terms, sum ));
    }
}
