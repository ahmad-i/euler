import java.util.ArrayList;

public class LargestPrimeFactor {
    public static boolean isPrime(double x, ArrayList z) {
        for (int i = 0; i < z.size(); i++) {
            if (x % (double) z.get(i) == 0) {
                return false;
            }
        }
        z.add(x);
        System.out.println(x);
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Double> primes = new ArrayList<Double>();
        primes.add(2.0);
        double answer = 1.0;
        double num = 600851475143.0;

        for (double x = 3.0; x < num/2; x ++) {
            if (num % x == 0) {
                if (x % 3.0 != 0) {
                    if (x % 5.0 != 0) {
                        if (isPrime(x, primes)) {
                            answer = x;
                        }
                    }
                }
            }
        }
        System.out.println(answer);
    }
}