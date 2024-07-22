import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of student");
        int n= s.nextInt();
        System.out.println("Enter the number of subject of each student");
        int sb[]= new int[n];
        int z=0;
        for(int i=0; i<n; i++){
            sb[i]= s.nextInt();
            if(sb[i]>z){
                z= sb[i];
            }
        }
        System.out.println("Enter the Marks of each subject of each student");
        int M[][]= new int[n][z];
        for(int i=0; i<n; i++){
            for(int j=0; j<sb[i]; j++){
                M[i][j]= s.nextInt();
            }
        }
        int A[]= new int[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<sb[i]; j++){
                A[i]= A[i] + M[i][j];
            }
            A[i]= A[i]/sb[i];
        }
        int x= Integer.MIN_VALUE;
        int y=0;
        for(int i=0; i<n; i++){
            if(A[i]>x){
                x= A[i];
                y=i+1;
            }
        }
        System.out.println(y+"th Student hold the first position");
    }
}
