import java.util.ArrayList;
public class Prime10001 {
    public static boolean isPrime(double x, ArrayList z) {
        for (int i = 0; i < z.size(); i++) {
            if (x % (double) z.get(i) == 0) {
                return false;
            }
        }
        z.add(x);
        //System.out.println(x);
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Double> primes = new ArrayList<Double>();
        primes.add(2.0);

        double num = 3;

        while (primes.size() != 10001) {
            isPrime(num, primes);
            num += 2;
        }

        System.out.println(primes.get(10000));
    }
}