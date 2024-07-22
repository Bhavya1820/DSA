public class Subsets {
    public static void findSubsets(String str, int i, String ans){
        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }

        //recursion
        //Yes choice 
        findSubsets(str, i+1, ans+str.charAt(i));
        //No choice
        findSubsets(str, i+1, ans);
    }
    public static void main(String[] args) {
        String str= "abc";
        findSubsets(str, 0, " ");
    }
}
