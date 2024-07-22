public class Solution {
    public static int palindromicSequence(String str){
        char arr[]= str.toCharArray();
        int output= 0;
        for(int i=0; i<str.length(); i++){
            for(int j=i; j<str.length(); j++){
                if(i==j){
                    output += 1;
                }else if(arr[i] == arr[j]){
                    output += 1;
                }else{
                    break;
                }
            }
        }
        return output;
    }
   
    public static void main(String[] args) {
        String str= "abaaba";
        System.out.println(palindromicSequence(str));

    }
}
