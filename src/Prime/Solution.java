package Prime;

import java.lang.Math;

public class Solution {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            int r = 0;
            for (int i = 0; i < Math.sqrt(n); i++) {
                if (n % (i + 2) == 0) {
                    r = 1;
                    break;
                }
            }
            if (r == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isPrime(39));
    }
}
