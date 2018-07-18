class Factorial {
    int recursiveFactorial(int n) {
        return (n == 1 || n == 0) ? 1 : n * recursiveFactorial(n - 1);
    }

    int iterativeFactorial(int n) {
        int factorial = 1, i;
        for (i=2; i<=n; i++)
            factorial *= i;
        return factorial;
    }
}
