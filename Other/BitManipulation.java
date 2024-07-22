public class BitManipulation {
    public static void oddOrEven(int n){
        int bitmark= 1;
        if((n & bitmark) == 0){
            //even number
            System.out.println("Even Number");
        }else{
            //odd nummber
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(12);       
    }
}
