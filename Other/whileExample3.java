import java.util.Scanner;

public class whileExample3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the value");
        int n= s.nextInt();
        int i=1, t=0;
        while(i <= n){
            t= t+i;
            i++;
            System.out.println(t);
        }
    }
}
