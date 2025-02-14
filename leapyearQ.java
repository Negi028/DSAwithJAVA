import java.util.Scanner;
public class leapyearQ {
    public static void main(String[] args) {
        System.out.println("ENTER ANY YEAR : ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        if((num%4==0 && num%100!=0)||num%400==0){
            System.out.println(num+" ,"+"yes this year a leap year");
        }else{
            System.out.println(num+" "+"not a leap year");
        }

    }
}
