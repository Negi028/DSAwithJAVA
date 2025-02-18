
import java.util.Scanner;

//fuction to print sum of all odd numbers from 1 to n
public class exerciseFunc2 {
    public static int sumOfOddNo(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;

            }
            
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        sumOfOddNo(n);
    }
}
