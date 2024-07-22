package Queue;
import java.util.*;
public class QueueDeque {
    static class Queue {
    Deque<Integer> deque= new LinkedList<>();

    public void add(int data){
        deque.addLast(data);
    }

    public int remove(){
        return deque.removeFirst();
    }

    public int peek(){
        return deque.getFirst();
    }
        
    }
    public static void main(String[] args) {
        Queue s= new Queue();

        s.add(1);
        s.add(2);
        s.add(3);

        System.out.println("Peek= "+s.peek());
    }
}
