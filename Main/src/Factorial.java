class Factorial {
    //calculate factorials
    int recursiveFactorial(int n) {
        return (n == 1 || n == 0) ? 1 : n * recursiveFactorial(n - 1);
    }

    int iterativeFactorial(int n) {
        int res = 1, i;
        for (i=2; i<=n; i++)
            res *= i;
        return res;
    }
}
