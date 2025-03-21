public class poistionsSumOddEven {
    public static void main(String[] args) {
        int num=8765;
        int evenPosSum=0;
        int oddPosSum=0;
        int pos=0;
        while(num>0){
            pos++;
            int lastDigit=num%10;
            if(pos%2==0){
                evenPosSum=evenPosSum+lastDigit;

            }else{
                oddPosSum=oddPosSum+lastDigit;
            }
            num=num/10;
        }
        System.out.println("EVEN POSITION SUM IS : "+evenPosSum);
        System.out.println("ODD POISITION SUM IS : "+oddPosSum);
        
    }
}
