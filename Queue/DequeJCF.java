package Queue;
import java.util.*;;
public class DequeJCF {
    public static void main(String[] args) {
        Deque<Integer> q= new LinkedList<>();
        q.addFirst(1);
        q.addFirst(2);
        q.addLast(3);
        q.addLast(4);

        System.out.println(q);

        q.removeLast();
        System.out.println(q);

        System.out.println("First El= "+ q.getFirst());
        System.out.println("Last El= "+q.getLast());
    }
}
