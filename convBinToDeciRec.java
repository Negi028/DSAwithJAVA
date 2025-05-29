public class convBinToDeciRec {
    static int convertBinarytoDecimal(int num,int result,int pow){
        if(num==0){
            return result;
        }
        int rem=num%10;
        result+=rem*(int)Math.pow(2, pow);
        return convertBinarytoDecimal(num/10,result,pow+1);
        
    }
    public static void main(String[] args) {
        System.out.print(convertBinarytoDecimal(1010, 0, 0));
    }
}
