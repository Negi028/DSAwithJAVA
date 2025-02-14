import java.util.Scanner;
public class sumofdigit {
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner input= new Scanner(System.in);
        int num=input.nextInt();
        int sumofdigits=0;
        while(num>0){
            int rem=num%10;
            sumofdigits=sumofdigits+rem;
            num=num/10;
        }
        System.out.println("sum of digits is : "+sumofdigits);
        

    }
}
