package UCLN;

import java.lang.Math;

public class Solution {
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        return (b == 0) ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(3 * 4 * 4372, 874752 * 5));
    }
}
