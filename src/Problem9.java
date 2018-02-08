/**
 Problem 9: Pythagorean triplet
 ---
 A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

 a2 + b2 = c2
 For example, 32 + 42 = 9 + 16 = 25 = 52.

 There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 Find the product abc.
 ---

 @author Travis Stratton
 */
public class Problem9 {
    public static void main(String ... args) {
        /*
            Using the equation for all pythagorean triples
            a = 2mn
            b = m^2 - n ^2
            c = m^2 + n ^2

            and
            a + b + c = 1000
            2mn + (m^2 - n^2) + (m^2 + n^2) = 1000
            reduces to
            n = 500/m - m

            and m > n.
         */
        double n = 0, m = 0;
        for (m = 1; m < 250; m++){
            /*
                100 is random.  Sides must be less than 500 to maintain proportions for pythagorean measurements (cant have a side less than 1)
                500/2 = m*n... so the products are at worst case 1, and 250
             */
            n = 500.0/m - m;
            if(n < m && n >0) {
                if (n == Math.floor(n)) {  // check if n is an integer
                    break;   // since we are told there is EXACTLY 1, we can break here
                }
            }
        }

        int a = 2 * (int)m * (int)n;
        System.out.println("a:" + a);
        int b = (int)(Math.pow(m,2) - Math.pow(n,2));
        System.out.println("b:" + b);
        int c = (int)(Math.pow(m,2) + Math.pow(n,2));
        System.out.println("c:" + c);

        System.out.println("Check a + b + c == 1000?  " + ((a+b+c)==1000));
        System.out.println("Check a^2 + b^2 == c^2?  " + ((Math.pow(a,2) + Math.pow(b,2)) == Math.pow(c,2)));

        System.out.println("\nProduct of A*B*C =  " + (a*b*c));
    }
}
