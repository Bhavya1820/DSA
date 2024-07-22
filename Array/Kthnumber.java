import java.util.Arrays;

public class Kthnumber {
    public static int number(int nums[], int k){
        int x=0;
        Arrays.sort(nums);
        int n= nums.length;
        for(int i=0; i<= n-k; i++){
            if(i == n-k){
                x = nums[i];
            }
        }
        return x;
    }
    public static void main(String[] args) {
        int nums[]= {3,2,1,5,6,4};
        int k=2;
        System.out.println(number(nums, k));
    }
}
