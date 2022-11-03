import java.util.Stack;

public class Stack_pract {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        for (int i = 1; i <= 5; i++) {
            st.push(i);
        }

        System.out.println(st); // . Printing Stack

        // . ********** Top element in Stack ***************
        System.out.println(st.peek());

        // . ********** removing element from Stack ***************

        st.pop();

        System.out.println(st.peek());
    }

}
