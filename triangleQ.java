import java.util.Scanner;
public class triangleQ {
    public static void main(String[] args) {
        System.out.println("ENTER SIDE ");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        System.out.println("ENTER SIDE ");
        int b=input.nextInt();
        System.out.println("ENTER SIDE ");
        int c=input.nextInt();
        if(a+b>c && b+c>a && c+a>b){
            System.out.println("VALID TRIANGLE");
        }
        else{
            System.out.println("NOT VALID TRIANGLE");
        }
    }
}
