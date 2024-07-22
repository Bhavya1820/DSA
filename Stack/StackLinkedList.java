public class StackLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next= null;
        }
    }

    static class Stack {
        static Node head= null;

        //isEmpty Method
        public static boolean isEmpty(){
            return head==null;
        }

        //Push Method
        public static void Push(int data){
            Node newNode= new Node(data);
            if (isEmpty()) {
                head= newNode;
                return;
            }

            newNode.next= head;
            head= newNode;
        }
        
        //Pop Method
        public static int Pop(){
            if(isEmpty()){
                return -1;
            }

            int top= head.data;
            head= head.next;
            return top;
        }

        //Peek Method
        public static int Peek(){
            if (isEmpty()) {
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s= new Stack();
        s.Push(1);
        s.Push(2);
        s.Push(3);

        while (!s.isEmpty()) {
            System.out.println(s.Peek());
            s.Pop();
        }
    }
}
