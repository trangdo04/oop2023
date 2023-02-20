package PhanSo;

public class Solution {
    private int numerator;
    private int denominator;

    /**
     * getter, setter cac thuoc tinh.
     *
     * @return thuoc tinh
     */
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // tim UCLN cua a va b
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        return (b == 0) ? a : gcd(b, a % b);
    }

    public Solution reduce() {
        int n = this.numerator;
        int d = this.denominator;
        int k = gcd(n, d);
        n /= k;
        d /= k;
        Solution result = new Solution(n, d);

        return result;
    }

    public Solution add(Solution a) {
        int x = this.numerator * a.denominator + this.denominator * a.numerator;
        int y = this.denominator * a.denominator;

        int k = gcd(x, y);
        x /= k;
        y /= k;
        Solution result = new Solution(x, y);
        return result;
    }

    public Solution subtract(Solution a) {
        int x = this.numerator * a.denominator - this.denominator * a.numerator;
        int y = this.denominator * a.denominator;

        int k = gcd(x, y);
        x /= k;
        y /= k;
        Solution result = new Solution(x, y);
        return result;
    }

    public Solution multiply(Solution a) {
        int x = this.numerator * a.numerator;
        int y = this.denominator * a.denominator;

        int k = gcd(x, y);
        x /= k;
        y /= k;
        Solution result = new Solution(x, y);
        return result;
    }

    public Solution divide(Solution a) {
        int x = this.numerator * a.denominator;
        int y = this.denominator * a.numerator;

        int k = gcd(x, y);
        x /= k;
        y /= k;
        Solution result = new Solution(x, y);
        return result;
    }

    public boolean equals(Solution obj) {
        Solution x = this.subtract(obj);

        return (x.numerator == 0);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
