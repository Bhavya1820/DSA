public class multiply {
    public static int[] productExceptitSelf(int nums[]){
        int[] x= new int[nums.length];
        int prd= 1;
        for(int i=0; i<nums.length; i++){
            for(int j= 0; j<nums.length; j++){
                if(j != i){
                    prd= prd * nums[j];
                }
            }
            x[i]= prd;
            prd=1;
        }
        return x;
    }
    public static void main(String[] args) {
       int nums[]= {1,2,3,4};
       int[] y= productExceptitSelf(nums);
        for(int i=0; i<nums.length; i++){
            System.out.println(y[i]);
        }
    }
}
