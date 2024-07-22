public class even {
    public static boolean isEven(int a){
        if(a % 2== 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isEven(5));
    }
}
