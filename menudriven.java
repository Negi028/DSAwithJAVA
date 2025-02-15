import java.util.Scanner;
public class menudriven {
    public static void main(String[] args) {
        Scanner  input= new Scanner(System.in);
        int n;
        do {  
            System.out.println("enter your choice(0 or 1) to input or not: ");
             n=input.nextInt();
            if(n==1){
            
            System.out.println("enter marks out of 100");
            int marks=input.nextInt();
            if(marks>=90){
                System.out.println("Good");
            }else if(80>marks && marks>=60){
                System.out.println("good");
            }else{
                System.out.println("as well as good");
            }
        }
        } while (n==1);
        input.close();
    }
}
