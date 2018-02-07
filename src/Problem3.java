/**
 Problem 3: Largest Prime Factor
 ---
 The prime factors of 13195 are 5, 7, 13 and 29.

 What is the largest prime factor of the number 600851475143 ?
 ---

 @author Travis Stratton
 */
public class Problem3 {

    public static void main(String ... args) {
        // Largest Possible Factor (not prime) of a number is its square root
        // so we can start from there and determine if its prime or not.

        long targetNumber = 600851475143L;

        for (long i=(long)Math.sqrt(targetNumber)-1; i > 2; i--) {
            if (targetNumber % i == 0) {
                if (checkPrime(i)) {
                    System.out.println(i);
                    break;
                };

            }
        }

    }

    /*
        Simple way to check for a prime number
     */
    public static boolean checkPrime(long prime) {
        // can speed up slightly by checking if even
        if (prime % 2 == 0) {
            return false;
        }
        for (long i = (long) Math.sqrt(prime) - 1; i > 2; i-- ) {
            if (prime % i == 0) {
                return false;
            }
        }
        return true;
    }
}
