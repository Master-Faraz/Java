import java.util.Arrays;

public class ARRAYS_CLASS {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int index = Arrays.binarySearch(arr, 4); // . Binary Search in sorted array
        // System.out.println(index);

        int[] arr_1 = { 100, 2, 31, 45, 5, 16, 87, 38, 19 };
        Arrays.sort(arr_1); // . Sorting an array --> Quick sort

        for (Integer i : arr_1)
            System.out.print(i + "\t");
        System.out.println("\n");

        Arrays.fill(arr, 1); // . Filling all values of arr with 1

        for (Integer i : arr)
            System.out.print(i + "\t");
        System.out.println("\n");

    }

}
