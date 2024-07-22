public class example4 {
    public static void main(String[] args) {
        int b=2, p=5;
        int r=b, t=b;
        int i=2;
        while(i<=p){
            r= -1*r*b;
            if(i%2 != 0){
                t= t-r;
            }
            i++;
        }
        System.out.println(t);
    }
}
