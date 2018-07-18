class BinarySearch {
    /*  RECURSIVE
    pass the array, left index, right index, and value to search
    check if middle is value else move left or right after comparing
    */
    int recursiveBinarySearch(int arr[], int l, int r, int x) {
        if (r>=l) {
            int mid = l + (r - l)/2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return recursiveBinarySearch(arr, l, mid-1, x);
            return recursiveBinarySearch(arr, mid+1, r, x);
        }
        return -1; //value not found
    }
    /*  ITERATIVE
    pass the array, left index, right index, and value to search
    check if middle is value else move left or right after comparing
    */
    int iterativeBinarySearch(int arr[], int l, int r, int x) {
        while (l <= r) {
            int m = l + (r-l)/2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1; //value not found
    }
    /*
    parse result and print results
    */
    void printValue(int n)
    {
        if (n == -1)
            System.out.println("Value not present");
        else
            System.out.println("Value found at index: " + n);
    }
}
