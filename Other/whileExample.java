import java.util.Scanner;

public class whileExample {
    public static void main(String[] args) {
        System.out.println("Enter the value between 1 to 3");
        Scanner s = new Scanner(System.in);
        int N= s.nextInt();
        switch(N){
            case 1:
            System.out.println("Enter the value of km");
            int x= s.nextInt();
            System.out.println(x*100);
            break;

            case 2:
            System.out.println("Enter the value of Rs");
            int y= s.nextInt();
            System.out.println(y*100);
            break;

            case 3:
            System.out.println("Enter the value of Hours");
            int h= s.nextInt();
            System.out.println(h*3600);
            break;

            default :
            System.out.println("wrong value enter");

        }
        s.close();
    }
}
