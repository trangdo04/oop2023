package Fibonacci;

public class Solution {
    // Type your main code here
    public static long fibonacci(long n) {
        // khai bao bien luu tru result
        long result = 0;

        long a = 0;
        long b = 1;
        long tmp;
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else if (n > 92) {
            return Long.MAX_VALUE;
        } else {
            for (int i = 0; i < n - 1; i++) {
                tmp = b;
                b += a;
                a = tmp;
            }
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println("f(5) : " + fibonacci(5));
    }
}
