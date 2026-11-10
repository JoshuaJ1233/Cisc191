import java.util.Scanner;

/**
 * Computes the greatest common divisor using recursion.
 *
 * @author Joshua Barrett, CISC 191
 */
public class GCDRecursion {

    public static int gcd(int m, int n) {
        m = Math.abs(m);
        n = Math.abs(n);

        if (n == 0) {
            return m;
        }

        if (m % n == 0) {
            return n;
        }

        return gcd(n, m % n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = input.nextInt();

        System.out.print("Enter the second number: ");
        int second = input.nextInt();

        System.out.println("The GCD of " + first + " and "
                + second + " is " + gcd(first, second));

        input.close();
    }
}
