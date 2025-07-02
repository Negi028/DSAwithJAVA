public class calculatePowerRec {
    static int calculatePower(int num,int pow){
        if(num==0){
            return 0;
        }
        if(pow==0){
            return 1;
        }
        int calPowN_1=calculatePower(num, pow-1);
        int res=num*calPowN_1;
        return res;
    }
    public static void main(String[] args) {
        int result =calculatePower(2, 5);
        System.out.println("power of num is: "+result );
    }
}
