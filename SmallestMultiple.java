public class SmallestMultiple {
    public static void main(String[] args) {
        int x = -1;
        int num = 20;
        boolean tf = false;
        while (x == -1) {
            for (int i = 1; i <= 20; i++) {
                if (num % i != 0) {
                    tf = true;
                }
            }
            if (tf == false) {
                x = num;
            }
            tf = false;
            num++;
        }
        System.out.println(x);
    }
}