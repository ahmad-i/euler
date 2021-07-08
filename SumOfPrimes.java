import java.util.ArrayList;
public class SumOfPrimes {
    public static boolean isPrime(double x, ArrayList z) {
        for (int i = 0; i < z.size(); i++) {
            if (x % (double) z.get(i) == 0) {
                return false;
            }
        }
        z.add(x);
        // System.out.println(x);
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Double> primes = new ArrayList<Double>();
        primes.add(2.0);

        double num = 3;

        while (num < 2000000) {
            isPrime(num, primes);
            System.out.println(num);
            num += 2;
        }
        double sum = 0;
        for(int i = 0; i < primes.size(); i++) {
            sum += primes.get(i);
        }
        System.out.println(sum);
    }
}