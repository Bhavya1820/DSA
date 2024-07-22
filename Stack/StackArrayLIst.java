import java.util.ArrayList;

public class StackArrayLIst {
    static class Stack{
        static ArrayList<Integer> list= new ArrayList<>();

        //isEmpty method
        public static boolean isEmpty(){
            return list.size()==0;
        }

        //Push Method
        public static void Push(int data){
            list.add(data);
        }

        //Pop Method
        public static int Pop(){
            if(isEmpty()){
                return -1;
            }

            int top= list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //Peek Method
        public static int Peek(){
            if(isEmpty()){
                return -1;
            }

            return list.get(list.size()-1);
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
