import java.util.Scanner;

public class linearsearch {

    public static int search(String num[], String key){
        for(int i=0; i<num.length; i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the your favourite dish");
        String menu[] = {"samosa", "chowmwin", "cholebhatture","momus","kachori","pakode"};
        String key= sc.nextLine();

        int index= search(menu, key);
        if(index== -1){
            System.out.print("Not found");
        }else{
            System.out.print("Key is at index: "+index);
        }
        sc.close();
    }
}
