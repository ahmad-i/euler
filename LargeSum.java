import java.util.Scanner;
import java.io.File;
import java.math.BigInteger;

public class LargeSum {
    public static void main(String[] args) throws Exception {
        
        File number = new File("/Users/ai/Documents/CS/JAVA/ProjectEuler/LargeNumber.txt");
        Scanner s = new Scanner(number);
        BigInteger big = new BigInteger("0");

        while (s.hasNextLine()) {
            BigInteger b = new BigInteger(s.nextLine());
            big = big.add(b);

        }
        System.out.println(big);

        
    }
}