import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number : ");
        int n=input.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"X"+i+"="+n*i);
        }
        
    }
}
