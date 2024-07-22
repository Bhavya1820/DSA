public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //Method for add a element at first
    public void addfirst(int data){
        // step1 -> create a new node
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }

        //step2 -> newNode.next=head
        newNode.next = head;

        //step3 -> head= newNode
        head = newNode;
    }

    //Method for add a element at last
    public void addLast(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        
        tail.next = newNode;

        tail = newNode;
    } 

    //Method for print a LinkList
    public void print(){
        if(head==null){
            System.out.println("LL is empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    //Method for add an element in the middle of linkedlist
    public void add(int idx, int data){
        if(idx==0){
            addfirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        
        while (i<idx-1) {
            temp = temp.next;
            i++;
        }

        // i=idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //Method for remove first element from linkedlist
    public static int removeFirst(){
        if(size==0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }else if (size==1) {
            int val= head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val= head.data;
        head= head.next;
        size--;
        return val;
    }

    //Method for remove element from last in linkedlist
    public int removeLast(){
        if (size==0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }else if (size==1) {
            int val= head.data;
            head=tail=null;
            size=0;
            return val;
        }

        //prev: i = size-2
        Node prev= head;
        for(int i=0; i<size-2; i++){
            prev= prev.next;
        }

        int val= tail.data;
        prev.next = null;
        tail= prev;
        size--;
        return val;
    }

    public int itrSearch(int key){
        Node temp= head;
        int i=0;

        while (temp != null) {
            if(temp.data == key){
                return i;   //Key found
            }
            temp= temp.next;
            i++;
        }

        //key not found
        return -1;
    }

    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }

        if (head.data==key) {
            return 0;
        }

        int idx= helper(head.next, key);
        if(idx==-1){
            return -1;
        }

        return idx+1;
    }

    public int recSearch(int key){
        return helper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node Next;

        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }

        head = prev;
    }

    public void deleteNthFromEnd(int n){
        //Calculate size
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        if(n==size){
            head = head.next;  //removeFirst
            return;
        }

        //size-n
        int i=1;
        int iToFind= size-n;
        Node prev= head;
        while (i<iToFind) {
            prev= prev.next;
            i++;
        }

        prev.next= prev.next.next;
        return; 
    }

    public static boolean isCycle(){
        Node slow= head;
        Node fast= head;

        while (fast!=null && fast.next!=null) {
            slow= slow.next;   // +1
            fast= fast.next.next; // +2
            if(slow==fast){
                return true; //cycle found
            }
        }
        return false; // cycle doesn't exist
    }

    public static void removeCycle(){
        //detect cycle
        Node slow= head;
        Node fast= head;
        boolean cycle= false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast= fast.next.next;
            if(fast==slow){
                cycle= true;
                break;
            }
        }
        if(cycle==false){
            return;
        }

        // find meeting point
        slow= head;
        Node prev= null; //last node
        while (slow != fast) {
            prev= fast;
            slow= slow.next;
            fast= fast.next;
        }

        //remove cycle
        prev.next= null;

    }

    public Node mergeSort(Node head){
        if (head == null || head.next == null) {
            return head;
        }

        //find mid
        Node mid= getMid(head);

        //left and right MS
        Node rightHead= mid.next;
        mid.next= null;
        Node newLeft= mergeSort(head);
        Node newRight= mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }

    private Node getMid(Node head){
        Node slow= head;
        Node fast= head.next;

        while (fast != null && fast.next != null) {
            slow= slow.next;
            fast= fast.next.next;
        }
        return slow; // mid node
    }

    private Node merge(Node head1, Node head2){
        Node mergedLL= new Node(-1);
        Node temp= mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next= head1;
                head1= head1.next;
                temp= temp.next;
            }else{
                temp.next= head2;
                head2= head2.next;
                temp= temp.next;
            }
        }
        while (head1 != null) {
            temp.next= head1;
            head1= head1.next;
            temp= temp.next;
        }

        while (head2 != null) {
            temp.next= head2;
            head2= head2.next;
            temp= temp.next;
        }

        return mergedLL.next;
    }

    public void ZigZag(){
        //find mid
        Node slow= head;
        Node fast= head.next;
        while(fast != null && fast.next != null){
            slow= slow.next;
            fast= fast.next.next;
        }
        Node mid= slow;

        //reverse 2nd half
        Node curr= mid.next;
        mid.next= null;
        Node prev= null;
        Node next;
        while (curr != null) {
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }
        Node left= head;
        Node right= prev;
        Node nextL, nextR;

        //alt merge -> Zig-Zag merge
        while (left != null && right != null) {
            nextL= left.next;
            left.next= right;
            nextR= right.next;
            right.next= nextL; 
            

            left= nextL;
            right= nextR;
        }

    }
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.print();
        ll.ZigZag();
        ll.print();
    }
}
