import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Factorial fac = new Factorial();
        StringReverse strRev = new StringReverse();
        Fibonacci fib = new Fibonacci();
        BinarySearch bSearch = new BinarySearch();
        Scanner scan = new Scanner(System.in);

        /* Fibonacci */
        System.out.println("\n--Fibonacci--");
        System.out.println("Enter Fibonacci Index to calculate: ");
        int n = scan.nextInt();
        System.out.println("Recursion: " + fib.recursiveFib(n));
        System.out.println("Iterative: " + fib.iterativeFib(n));

        /* Factorial */
        System.out.println("\n--Factorial--");
        System.out.println("Enter Factorial (n!) to calculate: ");
        n = scan.nextInt();
        System.out.println("Recursion: " + fac.recursiveFactorial(n));
        System.out.println("Iterative: " + fac.iterativeFactorial(n));

        /* String Reversal */
        System.out.println("\nString Reverse:");
        String hello = "Hello World!";
        System.out.println("Recursive: " + strRev.recursiveReverse(hello));
        System.out.println("Iterative: " + strRev.iterativeReverse(hello));

        /* Binary Search */
        int[] arr = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 76};
        int value1 = 11, value2 = 77, arrLength = arr.length, l = 0, r = arrLength -1;

        System.out.println("\nRecursive Binary Search:");
        int v1Index = bSearch.recursiveBinarySearch(arr, l, r, value1);
        int v2Index = bSearch.recursiveBinarySearch(arr, l, r, value2);
        bSearch.printValue(v1Index); //one value that works
        bSearch.printValue(v2Index); //other value that does not work

        System.out.println("\nIterative Binary Search:");
        int v3Index = bSearch.iterativeBinarySearch(arr,l, r, value1);
        int v4Index = bSearch.iterativeBinarySearch(arr,l, r, value2);
        bSearch.printValue(v3Index); //one value that works
        bSearch.printValue(v4Index); //other value that does not work
    }
}
