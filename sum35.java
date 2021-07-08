public class sum35 {
    public static void main(String[] args) {
        int sum = 0;
        int x = 0;
        while (x < 1000) {
            if (x % 5 == 0 || x % 3 == 0) {
                sum += x;
                // System.out.println(x);
                // System.out.println(sum);
            }
            x++;
        }
        System.out.println(sum);
    }
}           