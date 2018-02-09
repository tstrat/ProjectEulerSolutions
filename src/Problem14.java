import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

/**
 Problem 14: Longest Collatz squence
 ---
 The following iterative sequence is defined for the set of positive integers:

 n → n/2 (n is even)
 n → 3n + 1 (n is odd)

 Using the rule above and starting with 13, we generate the following sequence:

 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

 Which starting number, under one million, produces the longest chain?

 NOTE: Once the chain starts the terms are allowed to go above one million.
 ---

 @author Travis Stratton
 */
public class Problem14 {

    public static void main (String ... args) {

        int size = 0, max = 0;
        int val = 0;
        for (int i = 1000000; i > 2; i--) {
            size = getChainSize(i);
            if (size > max) {
                max = size;
                val = i;
            }
        }

        System.out.println(val);
    }

    private static int getChainSize(int n) {

        long num = n;
        List<Long> list = new ArrayList<>();
        while (num != 1) {
            list.add(num);

            // Sequence for next value.  Evens: n / 2 Odds: n * 3 + 1
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = 3 * num + 1;
            }
        }
        return list.size();
    }
}
