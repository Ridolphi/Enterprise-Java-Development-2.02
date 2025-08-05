package tdd;

public class OddIntegers {
    public static int[] getOddIntegers(int n) {
        if (n <= 0) return new int[0];

        int size = (n + 1) / 2;
        int[] odds = new int[size];

        for (int i = 0, num = 1; num <= n; i++, num += 2) {
            odds[i] = num;
        }
        return odds;
    }
}