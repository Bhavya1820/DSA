import java.util.Scanner;

public class MultiDimensionalArrays {

    public static boolean Search( int a[][], int key){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                if(a[i][j]== key){
                    System.out.println("key found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int a[][]= new int[3][3];
        int n= a.length, m= a[0].length;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j]= sc.nextInt();
            }
        }
        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        Search(a, 5);
    }
}
