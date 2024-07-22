import java.util.*;

public class StackQns4 {
    public static void StocksSpan(int Stocks[], int Span[]){
        Stack<Integer> s= new Stack<>();
        Span[0]= 1;
        s.push(0);
        
        for(int i=1; i<Stocks.length; i++){
            int currPrice= Stocks[i];
            while(!s.isEmpty() && currPrice > Stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                Span[i]= i+1;
            }else{
                int prevHigh= s.peek();
                Span[i]= i-prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int Stocks[]= {100,80,60,70,60,85,100};
        int Span[]= new int[Stocks.length];
        StocksSpan(Stocks,Span);

        for(int i=0; i<Span.length; i++){
            System.out.println(Span[i]+ " ");
        }
    }
}
