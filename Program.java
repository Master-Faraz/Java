public class Program {

    public int leader;

    public static void leaders(int arr[], int size) {
        for (int i = 0; i <= size - 1; i++) {

            for (int j = i + 1; j <= size - 1; j++) {

                if (arr[i] >= arr[j]) {

                    Leader = arr[i];

                } else {

                    Leader = 0;

                }

                System.out.print(Leader);
            }

        }
    }

    public static void main(String[] args) {

        int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };

        int n = arr.length;

        leaders(arr, n);
    }
}
