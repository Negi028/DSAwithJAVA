import java.util.Scanner;
public class gradeQ {
    public static void main(String[] args) {
        System.out.println("ENTER THE MARKS : ");
        Scanner input= new Scanner(System.in);
        int marks=input.nextInt();
        if(marks<0 && marks>100){
            System.out.println("give valid input ");
        }
        else if(marks>=90 && marks<=100){
            System.out.println("A");
        }
        else if(marks>=80 && marks<=89){
            System.out.println("B");
        }
        else if(marks>=70 && marks<=79){
            System.out.println("C");
        }
        else if(marks>=60 && marks<=69){
            System.out.println("D");
        }
        else if(marks<60){
            System.out.println("F");
        }

    }
}
