package SearchAlgo;

public class SearchAlgo {

    // ---------------- LINEAR SEARCH ----------------

    // Performs linear search to find the index of the key in the array
    public static int linearSearch(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i; // key found at index i
            }
        }
        return -1; // key not found
    }

    // Prints the result of linear search with key index and value
    public static void printKey(int num[], int key) {
        int index = linearSearch(num, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("key is at index :" + index + "  Value of key : " + num[index]);
        }
    }

    // ---------------- BINARY SEARCH ----------------

    // Performs binary search on a sorted array
    public static int binarySearch(int num[], int key) {
        int start = 0, end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == key) {
                return mid; // key found at mid
            }
            if (num[mid] < key) {
                start = mid + 1; // search right half
            } else {
                end = mid - 1; // search left half
            }
        }
        return -1; // key not found
    }

    // Checks if array is sorted in ascending order
    private static boolean isSorted(int[] num) {
        for (int i = 1; i < num.length; i++) {
            if (num[i] < num[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // Validates sorting and prints binary search result
    public static void searchAndReport(int[] num, int key) {
        if (!isSorted(num)) {
            System.out.println("Array must be sorted for binary search.");
            return;
        }

        int result = binarySearch(num, key);
        if (result != -1) {
            System.out.println("Index for key in array is: " + result);
        } else {
            System.out.println("Key not found in array.");
        }
    }

    // ---------------- LARGEST & SMALLEST ----------------

    // Finds and prints the largest and smallest values in the array
    public static void getLargestandSmallest(int num[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }

        System.out.println("smallest value is : " + smallest);
        System.out.println("largest value is : " + largest);
    }

    // ---------------- REVERSE ARRAY ----------------

    // Reverses the array in-place and prints it
    public static void reverseArray(int num[]) {
        int first = 0, last = num.length - 1;

        while (first < last) {
            // swap first and last
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;
            first++;
            last--;
        }

        // print reversed array
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    // ---------------- PAIRS IN ARRAY ----------------

    // Prints all unique pairs in the array and their count
    public static void printPairs(int num[]) {
        int tpairs = 0;

        for (int i = 0; i < num.length - 1; i++) {
            int tpi = 0;
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + num[i] + "," + num[j] + ") ");
                tpi++;
                tpairs++;
            }
            System.out.print("--> " + num[i] + " = " + tpi);
            System.out.println();
        }

        System.out.print("total pairs = " + tpairs);
        System.out.println();
    }

    // ---------------- SUBARRAYS & MAX SUM ----------------

    // Prints all subarrays, their sums, and the maximum subarray sum
    public static void printSubarray(int num[]) {
        int ts = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                    sum += num[k];
                }
                System.out.print(" = " + sum);
                if (maxSum < sum) {
                    maxSum = sum;
                }
                System.out.println();
                ts++;
            }
            System.out.println();
        }

        System.out.println("maxsum of subarray is = " + maxSum);
        System.out.println("total no of sub array = " + ts);
        System.out.println();
    }

    // ---------------- MAIN METHOD ----------------

    public static void main(String[] args) {
        // Linear Search
        int num1[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key1 = 10;
        int key2 = 1;
        printKey(num1, key1);
        printKey(num1, key2);

        // Binary Search
        int array[] = { 2, 9, 6, 45, 10, 12, 14 }; // Unsorted
        int array1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Sorted
        int key = 10;
        searchAndReport(array, key);
        searchAndReport(array1, key);

        // Largest and Smallest
        int num2[] = { 1, 2, 6, 3, 5 };
        int num3[] = { 10, 20, 2, 13, 0, 1, 2 };
        getLargestandSmallest(num2);
        getLargestandSmallest(num3);

        // Reverse Array
        int array2[] = { 2, 4, 6, 8, 10 };
        int array3[] = { 1, 3, 5, 7, 9 };
        int array4[] = { 12, 13, 14, 15 };
        reverseArray(array2);
        reverseArray(array3);
        reverseArray(array4);

        // Pairs in Array
        int num4[] = { 2, 4, 6, 8, 10 };
        printPairs(num4);

        // Subarrays
        int array5[] = { 2, 4, 6, 8, 10 };
        int array6[] = { 1, -2, 6, -1, 3 };
        printSubarray(array5);
        printSubarray(array6);
    }
}
