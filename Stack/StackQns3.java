import java.util.*;

public class StackQns3 {
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int top= s.pop();
        reverseStack(s);
        StackQns1.pushAtBottom(s,top);
    }

    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverseStack(s);
        printStack(s);
    }
}
