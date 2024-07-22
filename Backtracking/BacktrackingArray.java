public class BacktrackingArray {
    public static void Changearr(int arr[], int i, int val){
        //base class
        if(i== arr.length){
            printArr(arr);
            return;
        }

        //recursion
        arr[i]= val;
        Changearr(arr, i+1, val+1); //function call
        arr[i]= arr[i]-2; // Backtracking
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= new int[5];
        Changearr(arr, 0, 1);
        printArr(arr);
    }
}
