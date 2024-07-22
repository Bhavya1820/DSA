import java.util.*;

public class palindrome {
    public static void pal( int a){
        int mynum=a;
        int x=0;
        while(a>0){
            int y= a % 10;
            x= (x * 10) + y ;
            a= a/10;
        }
        System.out.println(x);
        if(x==mynum){
            System.out.println(mynum + " is palindrome");
        }else{
            System.out.println(mynum + " is not palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        pal(num);
    }
}
