public class Duplicate {

    public static boolean Duplicates(int num[]){
       int n= num.length;

       for(int i=0; i<n; i++){
        for(int j= i+1; j<n; j++){
            if(num[i]==num[j]){
                return true;
            }
        }
       }
       return false;
    }
    public static void main(String[] args) {
        int num[]= {2,3,4,5,6,7};
        System.out.println(Duplicates(num));
    }
}
