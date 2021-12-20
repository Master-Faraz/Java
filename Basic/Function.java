public class Function {
    public static void main(String[] Faraz) {

        /*
         * Public --> Canbe accessed outside the class
         * Static --> For using this function we don't need to make objects of this
         * function
         * 
         */

        int a = 6, b = 10;

        System.out.println(average(a, b));

    }

    static int average(int a, int b) // . Without Static it throws error
    {
        return (a + b) / 2;
    }

}
