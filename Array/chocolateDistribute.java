import java.util.Arrays;

public class chocolateDistribute {

    public static int distribution(int a[], int m){
    int min_diff= Integer.MAX_VALUE;
    Arrays.sort(a);
    for(int i=0; i+m-1 < a.length; i++){
        int diff= a[i+m-1]-a[i]; 
        if(diff<min_diff){
            min_diff= diff;
        }
    }
    return min_diff;
    }
    public static void main(String[] args) {
        int a[]= {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int std= 7;

        System.out.println(distribution(a, std));

    }
}
