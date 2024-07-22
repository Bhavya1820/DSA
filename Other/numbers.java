public class numbers {
    public static boolean sum(int nums[], int key){
        for(int i=0; i<nums.length; i++){
            for(int j= i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == key){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]= {11, 15, 6, 8, 9, 10};
        int key= 16;
        System.out.println(sum(nums, key));

    }
}
