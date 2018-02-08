/**
 Problem 5: Smallest Multiple
 ---
 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

 What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 ---

 @author Travis Stratton
 */
public class Problem5 {
    /*
        If a number is evenly divisible by 8, it is also by 4 and 2.  Likewise 6 is 2 and 3, and 9 is also 3.
        So, we need to find the smallest multiple divisible by 11,12,13,14,15,16,17,18,19,20.
        Knowing 20 is a factor of 10 and even, we can check multiples of that against the other set.
     */

    public static void main(String ... args) {
        int[] factors = {11,12,13,14,15,16,17,18,19,20};
        int currentValue = 20;
        while (true) {
            currentValue += 20;
            boolean success = true;
            for (int i = 0; i < factors.length; i++){
                if (currentValue % factors[i] != 0) {
                    success = false;
                    break;
                }
            }
            if (success) {
                break;
            }

        }

        System.out.println(currentValue);
    }
}
