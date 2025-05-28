//q. is 153 is armstrong ? output : true : 1^3+5^3+3^3=153
public class isArmstrongRecu {
    static int countDigit(int num){
        if(num==0){
            return 0;
        }
        int count=countDigit(num/10);
        return count+1;

    }
    static void isArmstrong(int num,int result,int cpy){
        int count = countDigit(cpy);
        if(num==0){
            System.out.println(result);
            System.out.println(cpy==result?"Armstrong number ":"Not a Armstrong number");
            return;
        }
        //pre logic : stack building approach
        int rem = num%10;
        int pow= (int)Math.pow(rem, count);
        result=result+pow;
        isArmstrong(num/10, result,cpy);

        
    }
    public static void main(String[] args) {
        int num=100;
        int cpy=num;
        isArmstrong(num, 0,cpy);
    }
}
