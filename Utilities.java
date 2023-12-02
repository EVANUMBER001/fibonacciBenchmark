public class Utilities {
    public static long recursiveFib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return recursiveFib(n - 1) + recursiveFib(n - 2);
        }
    }

    public static long iterativeFib(int n) {
        if (n <= 1) {
            return n;
        }
        long fib = 0;
        long prev1 = 1;
        long prev2 = 0;
        for (int i = 2; i <= n; i++) {
            fib = prev1 + prev2;
            prev2 = prev1;
            prev1 = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        System.out.printf("%-10s%-15s%-20s%-10s\n", "x", "fib(x)", "Recursive(ns)", "Iterative(ns)");
        System.out.println("==========================================================");

        for (int i = 10; i <= 50; i += 10) {
            // Calculate time in nanoseconds for recursive Fibonacci
            long start = System.nanoTime();
            recursiveFib(i);
            long elapsedRec = System.nanoTime() - start;

            // Calculate time in nanoseconds for iterative Fibonacci
            start = System.nanoTime();
            long feb = iterativeFib(i);
            long elapsedIter = System.nanoTime() - start;

            System.out.printf("%-10d%-15d%,-20d%,-10d\n", i, feb, elapsedRec, elapsedIter);
        }

        System.out.println("==========================================================");
    }
}