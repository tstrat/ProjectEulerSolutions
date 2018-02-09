import java.math.BigInteger;
/**
 Problem 16: Power digit Sum
 ---
 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

 What is the sum of the digits of the number 2^1000?
 ---
 @author Travis Stratton
 */
public class Problem16 {

    public static void main(String ... args) {
        BigInteger bi = new BigInteger("2");
        bi = bi.pow(1000);
        System.out.println(bi);
        String biString = bi.toString();
        long sum = 0;
        for (int i=0; i < biString.length(); i++){
            sum += (biString.charAt(i) - '0');
        }

        System.out.println("The Sum of all the digits of the number 2 ^ 1000 is : " + sum);
    }
}
