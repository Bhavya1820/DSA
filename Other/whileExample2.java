import java.util.Scanner;

public class whileExample2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a value");
        int x= s.nextInt();
        int i=1, t=0;
        while(i<=x){
            t= t+(10*i+2);
            i++;
        }
        System.out.println(t);
    }
}
