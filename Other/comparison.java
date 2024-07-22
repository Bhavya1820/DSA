import java.util.Scanner;

public class comparison {

    public static void comparisons(int A[]){
        int x= Integer.MIN_VALUE;
        int y= Integer.MAX_VALUE;

        for(int i=0; i<A.length; i++){
            if(x<A[i]){
                x=A[i];
            }
            if(y>A[i]){
                y= A[i];
            }
        }
        System.out.println("Maximum element is: "+x);
        System.out.println("Minimum element is: "+y);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int A[]= new int[10];
        System.out.println("Enter the elements of Array");
        for(int i=0; i<10; i++){
            int x= sc.nextInt();
            A[i]= x;
        }
        //int A[]={22,14,8,17,35,3};
        comparisons(A);
        sc.close();
    }
}
