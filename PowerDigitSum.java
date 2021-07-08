public class PowerDigitSum {
    public static void main(String[] args) {
        double num = Math.pow(2,1000);
        String s = String.format("%f", num);
        System.out.println(s);
        double sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                break;
            }
            sum += Double.parseDouble(s.substring(i,i+1));
        }
        System.out.println(sum);

    }
}