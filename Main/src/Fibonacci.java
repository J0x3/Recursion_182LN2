class Fibonacci {
    int recursiveFib(int n) {
        if (n <= 1)
            return n;
        return recursiveFib(n-1) + recursiveFib(n-2);
    }

    int iterativeFib(int n) {
        if (n <= 1)
            return n;
        //else
        int fibNumber = 0; //default zero
        int temp1 = 1;
        int temp2 = 1;
        for (int count = 2; count < n; count++){
            fibNumber = temp1 + temp2;
            temp1 = temp2;
            temp2 = fibNumber;
        }
        return fibNumber;
    }
}
