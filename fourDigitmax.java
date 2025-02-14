//find  max of  four digit

import java.util.Scanner;
public class fourDigitmax {
    public static void main(String[] args) {
        System.out.println("ENTER FIRST DIGIT : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("ENTER SECOND DIGIT : ");
        int b = input.nextInt();
        System.out.println("ENTER THIRD DIGIT : ");
        int c = input.nextInt();
        System.out.println("ENTER FOURTH DIGIT : ");
        int d = input.nextInt();

        if(a>b){
            if(a>c){
                if(a>d){
                    System.out.println(a+""+ "MAXIMUM NUMBER");
                }
            }
        }else if(b>c){
            if(b>d){
                System.out.println(b+""+"MAXIMUM NUMBER");
            }
        }else if(c>d){
            System.out.println(c+""+"MAXIMUM NUMBER");
        }else{
            System.out.println(d+""+"MAXIMUM NUMBER");
        }
    }
    
}
