import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //object instantiation
        Factorial fac = new Factorial();
        StringReverse strRev = new StringReverse();
        Fibonacci fib = new Fibonacci();
        BinarySearch bSearch = new BinarySearch();
        //user input scanner
        Scanner scan = new Scanner(System.in);
        //fibonacci ----------------------------------------
        System.out.println("\n--Fibonacci--");
        System.out.println("Enter Fibonacci Index to calculate: ");
        int n = scan.nextInt();
        System.out.println("Recursion: " + fib.recursiveFib(n));
        System.out.println("Iterative: " + fib.iterativeFib(n));
        //factorial ----------------------------------------
        System.out.println("\n--Factorial--");
        System.out.println("Enter Factorial (n!) to calculate: ");
        n = scan.nextInt();
        System.out.println("Recursion: " + fac.recursiveFactorial(n));
        System.out.println("Iterative: " + fac.iterativeFactorial(n));
        //string reversal ----------------------------------------
        System.out.println("\nString Reverse:");
        String hello = "Hello World!";
        System.out.println("Recursive: " + strRev.recursiveReverse(hello));
        System.out.println("Iterative: " + strRev.iterativeReverse(hello));
        //binary search ----------------------------------------
        //array info
        int[] arr = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 76};
        int value1 = 11;
        int value2 = 77;
        int arrLength = arr.length;
        //RECURSIVE ---
        System.out.println("\nRecursive Binary Search:");
        int v1Index = bSearch.recursiveBinarySearch(arr,0,arrLength-1,value1);
        int v2Index = bSearch.recursiveBinarySearch(arr,0,arrLength-1,value2);
        bSearch.printValue(v1Index); //one value that works
        bSearch.printValue(v2Index); //other value that does not work
        //ITERATIVE ---
        System.out.println("\nIterative Binary Search:");
        int v3Index = bSearch.iterativeBinarySearch(arr, value1);
        int v4Index = bSearch.iterativeBinarySearch(arr, value2);
        bSearch.printValue(v3Index); //one value that works
        bSearch.printValue(v4Index); //other value that does not work
    }
}
