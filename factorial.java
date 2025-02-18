
import java.util.Scanner;

// factorial function : n*(n-1)*(n-2)....: o!=1

public class factorial {
    public static void printFact(int n){
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int fact=1;
        //loops
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
        return;//void dont need to return statement by default it return statement

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        printFact(n);
        
    }
}
