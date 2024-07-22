public class subArrays {
    public static void printSubArray(int numbers[]){
        int sum=0;
        int maxSum= Integer.MIN_VALUE;
        int minSum= Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            int start= i;
            for(int j=i; j<numbers.length; j++){
                int end= j;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                    sum= sum+numbers[k];
                }
                System.out.print("sum= "+sum);
                if(maxSum < sum){
                    maxSum= sum;
                }
                if(minSum > sum){
                    minSum = sum;
                }
                sum=0;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum sum= "+maxSum);
        System.out.println("Minimum sum= "+minSum);
    }
    public static void main(String[] args) {
        int numbers[]= {2,4,6,8,10};
        printSubArray(numbers);
    }
}
