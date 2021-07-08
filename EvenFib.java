import java.util.ArrayList;

public class EvenFib {
    public static void main(String[] args) {
        ArrayList<Double> fibs = new ArrayList<Double>();
        double x = 1;
        double sum = 0;
        fibs.add(1.0);
        fibs.add(1.0);

        while (x < 4000000) {
            // 1 1 2 3 5 8 13
            x = fibs.get(fibs.size() - 2) + fibs.get(fibs.size() - 1);
            fibs.add(x);
            System.out.println(x);
        }
        for (int i = 0; i < fibs.size(); i++) {
            if (fibs.get(i) < 4000000 && fibs.get(i) % 2 == 0) {
                sum += fibs.get(i);
            }
        }
        System.out.println("\n\n\n" + sum);
    }
}