public class Exception_Handling {
    public static void main(String[] args) // . Main Function
    {
        int arr[] = { 1, 2, 3, 40 };

        // System.out.println(arr[5]); // . Here we are going out of bound exception.
        // Below line cannot be executed

        // try {
        // System.out.println(arr[5]);
        // } catch (ArrayIndexOutOfBoundsException e) // . Catch block
        // {
        // System.out.println("Exception aaya tha ");

        // // System.out.println(e); // This will print full exception

        // System.out.println(e.getLocalizedMessage());

        // }

        // ***** This will run for all exceptions
        try {
            System.out.println(2/0);
        } catch (Exception e) // . Catch block
        {
            System.out.println("Exception aaya tha ");

            // System.out.println(e); // This will print full exception

            System.out.println(e.getLocalizedMessage());

        }

        System.out.println("Niche ki line");

    }
}
