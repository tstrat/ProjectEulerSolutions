import java.util.ArrayList;

/**
 Problem 7: 10001st Prime Number
 ---
 By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

 What is the 10,001st prime number?
 ---

 @author Travis Stratton
 */
public class Problem7 {
    public static void main(String ... args) {
        long time = System.currentTimeMillis();
        int term = 1000001;
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);  // get 2 in there so our loop can only check for odds
        for (int i = 3; primes.size() < term; i+=2) {
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
            if (prime){
                primes.add(i);
            }
        }

        System.out.println("The " + term + " prime is : " + primes.get(term-1));
        System.out.println("Took " + (System.currentTimeMillis() - time) + " ms");
    }
}
