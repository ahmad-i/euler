public class Triplet {
    public static boolean isTriplet (int a, int b, int c) {
        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c,2)) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        for (int a = 1; a < 1000/2; a++) {
            for (int b = a; b < 1000/2; b++) {
                int c = 1000 - (b + a);
                if (a + b + c == 1000) {
                    if (isTriplet(a, b, c)) {
                        System.out.println(a * b * c);
                    }
                }
            }
        }        
    }
}