//print sum of first n Natural numbers
import java.util.Scanner;
public class recap_loop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter n number where u want addition : ");
        int n=input.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            sum=sum+i;
            
            i++;
        }
        System.out.println(sum);
    }
    
}
