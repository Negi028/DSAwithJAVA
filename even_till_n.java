import java.util.Scanner;
public class even_till_n {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter nth number to find even number: ");
        int n= input.nextInt();
        for(int i=1;i<=n;i++){
            if(n==1){
                System.out.println("1 coprime");
            }
            if (i%2==0) {
                System.out.println(i+" ");
            }
            
        }
    }
}
