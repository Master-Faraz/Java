public class Array {
    public static void main(String[] args) {
        int arr[] = new int[5]; // . new keyword is used when we want to initialize the array

        for (int i = 0; i < arr.length; i++) // arr.length --> obj for finding array length
        {
            arr[i] = (i + 1) * 100;
            System.out.println(arr[i]);
        }

        // . For 2D array

    }
}
