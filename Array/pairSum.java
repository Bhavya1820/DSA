public class pairSum {
    public static boolean Sum(int nums[], int key){
        for(int i=0; i<nums.length; i++){
            for(int j=1; j<nums.length; j++){
                if(nums[i] + nums[j] == key){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]= {11, 15, 26, 38, 9, 10};
        int key= 45;
        System.out.println(Sum(nums, key));

    }
}
