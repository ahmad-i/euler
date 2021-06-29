public class palindrome {
    public static boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        int len = num.length();
        for (int i = 0; i < len/2; i++) {
            if (num.charAt(i) != num.charAt(len-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int max = -1;

        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                if (isPalindrome(i*j)) {
                    if (i*j > max) {
                        max = i*j;
                    }
                }
            }
        }
        System.out.println(max);
    }
}