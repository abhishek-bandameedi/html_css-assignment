package collections;

import java.util.Iterator;
import java.util.Stack;

public class SampleStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<Integer>();
        st.push(10);
        st.push(12);
        st.push(14);
        System.out.println(st);

        st.pop();

        System.out.println(st.peek());

        System.out.println(st.empty());
        System.out.println(st);

        System.out.println(st.search(10)); //returns the distance from top of the stack and top most item on stack is considered to be 1

        Iterator<Integer> it=st.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
