public class pract {
    private static int i=0,j=0;

    public static void main(String[] args) {
        int i=3 , k=4;
        {
            int j=2;
            System.out.println(" i + j is " + i+j);
        }

        k=i+j;
        System.out.println(k);
        System.out.println(j);
    }
    
}
