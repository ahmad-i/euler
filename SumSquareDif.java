public class SumSquareDif {
    public static void main(String[] args) {
        double sumOfSquare = 0;
        double squareOfSum = 0;

        for (int i = 1; i < 101; i++) {
            sumOfSquare += Math.pow(i, 2);
            squareOfSum += i;

        }
        squareOfSum = Math.pow(squareOfSum, 2);

        double ans = squareOfSum - sumOfSquare;
        System.out.println(ans);
    }
}