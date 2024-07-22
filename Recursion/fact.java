public class fact {

    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f= f*i;
        }
        return f;
    }

    public static int factorial1(int n){
        if(n==0){
            return 1;
        }

        int fnm1= factorial1(n-1);
        int fn= n * fnm1;
        return fn;
    }

    public static int calcSum(int n){
        if(n == 1){
            return 1;
        }
        int snm1= calcSum(n-1);
        int sn= n + snm1;
        return sn;
    }

    public static int bc(int a, int b){
        int x= factorial(a);
        int y= factorial(b);
        int z= factorial(a-b);
        int b_c= x/(y*z);
        return b_c;
    }
    public static void main(String[] args) {
        System.out.println(calcSum(5));
    }
}
