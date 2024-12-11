public class Factorial {
    public static int getFactorial(int f) {
        if (f == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }
}
