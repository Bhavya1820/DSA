public class solution1 {
   public static void subString(String s){
    for(int i=0; i<s.length(); i++){
        for(int j=i; j<s.length(); j++){
            System.out.println(s.substring(i, j));
        }
    }
   }
    public static void main(String[] args) {
        String s="abcd";
        subString(s);
    }
}
