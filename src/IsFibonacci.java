public class IsFibonacci {
    public static void main(String[] args) {
        System.out.println(IsFibonacci.isfibonaci(4));
    }

    public static boolean isPrefectSquare(int n) {
        int a = (int) Math.sqrt(n);
        if (a * a == n)
            return true;
        return false;
    }

    public static boolean isfibonaci(int n) {
        if (isPrefectSquare(5 * n * n + 4) || isPrefectSquare(5 * n * n - 4))
            return true;
        return false;
    }
}
