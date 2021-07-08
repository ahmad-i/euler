import java.util.ArrayList;

public class Collatz {
    public static double nextChain(double x) {
        if (x % 2 == 0) {
            x = x / 2;
        } else {
            x = (3 * x) + 1;
        }
        return x;
    }

    public static void main(String[] args) {
        double chainCount = 0;
        double num = 1;
        double highestCountNum = -1;
        double highestChainCount = -1;
        for (int i = 1; i < 1000000; i++) {
            num = i;
            chainCount = 0;
            while (num != 1) {
                chainCount++;
                num = nextChain(num);
            }
            if (chainCount > highestChainCount) {
                highestChainCount = chainCount;
                highestCountNum = i;
            }
        }
        System.out.printf("highest number: %.2f \nchain count: %.2f\n", highestCountNum, chainCount);

    }
}