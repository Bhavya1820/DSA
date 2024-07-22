import java.util.Scanner;

public class reverseArray {

    public static void reverse(int A[]){
        int first=0, last= A.length-1;

        while(first < last){
            int temp= A[last];
            A[last]= A[first];
            A[first]= temp;
            
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        //int A[]={66,77,88,11,22,55,33,99};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the elements of array");
        int A[]= new int[5];
        for(int i=0; i<A.length; i++){
            int x= sc.nextInt();
            A[i]= x;
        }
        reverse(A);

        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
