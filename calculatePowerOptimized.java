public class calculatePowerOptimized {
    static int calculatePow(int num,int pow){
        if(num==0){
            return 0;

        }
        if(pow==0){
            return 1;
        }
        //if power is even
        if(pow%2==0){
            return calculatePow(num, pow/2)*calculatePow(num, pow/2);
        }else{
            //odd power
            return calculatePow(num, pow/2)*calculatePow(num, pow/2)*num;
        }

    }
    public static void main(String[] args) {
        int result=calculatePow(2, 5);
        System.out.println("ans : "+result);
    }
}
