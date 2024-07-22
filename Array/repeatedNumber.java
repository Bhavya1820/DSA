public class repeatedNumber {
    public static int[] repeated(int[] A){
        int x[]= new int[2];
      int count[]= new int[A.length+1];
      for(int i=0; i<A.length; i++){
        count[A[i]]++;
      }
      for(int i=1; i<=A.length; i++){
        if(count[i] == 2){
            x[0]= i;
        }else if(count[i] ==0){
            x[1]= i;
        }
      }
      return x;

    }
    public static void main(String[] args) {
        int A[]= {3, 1, 2, 5, 3};
        int B[]= repeated(A);
        for(int i=0; i<B.length; i++){
            System.out.print(B[i]+" ");
        }
    }
}
