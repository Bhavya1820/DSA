public class stringPalindrome {
   public static String bha(String s){
    char c[]= s.toCharArray();
    String n= new String();
    for(int i=0; i<s.length(); i++){
        if(i==0){
            n = n + c[i];
        }else if(c[i] != c[i-1]){
            n = n + c[i];
        }
    }
    return n;
   }
    public static void main(String[] args) {
        String s="aabb";
        System.out.println(bha(s));
        
    }
}
