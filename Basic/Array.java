public class Array {
    public static void main(String[] args) {
        int arr[] = new int[5]; // . new keyword is used when we want to initialize the array

        for (int i = 0; i < arr.length; i++) // arr.length --> obj for finding array length
        {
            arr[i] = (i + 1) * 100;
            System.out.println(arr[i]);
        }

        // . For 2D array

        int a[][] = new int[2][3];
        int array[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

        // for (int i = 0, j = 0; (i < 2) && (j < 3); i++, j++) {
        //     System.out.println(array[i][j]);
        // }

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(array[i][j]);
            }
        }

    }
}

