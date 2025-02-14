import java.util.Scanner;
public class passwordQ {
    public static void main(String[] args) {
        System.out.println("ENTER PASSWORD ");
        Scanner input= new Scanner(System.in);
        String pass= input.nextLine();
        if(pass.length()>=8){
            for(int i=0;i<=pass.length();i++){
                char ch=pass.charAt(i);
                if(Character.isUpperCase(ch) && Character.isDigit(ch)){
                    System.out.println(pass+" "+"VALID PASSWORD");
                }
            }
        }else{
            System.out.println(pass+" "+ "not valid");
        }
    }
}
