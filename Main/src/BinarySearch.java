class BinarySearch {
    //pass the array, left index, right index, and value to search
    //return int
    int recursiveBinarySearch(int arr[], int l, int r, int x) {
        if (r>=l) {
            //mid point
            int mid = l + (r - l)/2;

            // If value is at mid point
            if (arr[mid] == x)
                return mid;

            // If value is smaller -> search left side
            if (arr[mid] > x)
                return recursiveBinarySearch(arr, l, mid-1, x);

            // Else right side
            return recursiveBinarySearch(arr, mid+1, r, x);
        }
        //value not found
        return -1;
    }
    //pass array and value to search
    int iterativeBinarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            //mid point
            int m = l + (r-l)/2;
            // check mid
            if (arr[m] == x)
                return m;
            // goes right
            if (arr[m] < x)
                l = m + 1;
            // goes left
            else
                r = m - 1;
        }
        // not found
        return -1;
    }
    //parse result and print
    void printValue(int n)
    {
        if (n == -1)
            System.out.println("Value not present");
        else
            System.out.println("Value found at index: " + n);
    }
}
