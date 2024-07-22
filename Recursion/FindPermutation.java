public class FindPermutation {
    public static void stringPermutation(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0; i<str.length(); i++){
            char curr= str.charAt(i);
            String Newstr= str.substring(0, i) + str.substring(i+1);
            stringPermutation(Newstr, ans+curr);//recursive function call
        }
    }
    public static void main(String[] args) {
        String str= "abc";
        stringPermutation(str, "");

    }
}
