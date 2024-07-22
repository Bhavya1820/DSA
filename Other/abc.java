import java.util.Scanner;

class Emp{
    String Name;
    int sal;
    void setData(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Name");
        Name= s.nextLine();
        System.out.println("Enter the salary");
        sal= s.nextInt();
    }
    void getData(){
        System.out.println(Name+" "+ sal);
    }
}

public class abc{
    public static void main(String[] args) {
        Emp E= new Emp();
        E.setData();
        E.getData();
    }
}
