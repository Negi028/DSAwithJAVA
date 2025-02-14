public class printDigit {
    public static void main(String[] args) {
        int num=12345;
        //count the digit
        int copy=num; 
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }//num=0
        num=copy;
        int pow=(int) Math.pow(10,count-1);
        while(num>0){
            System.out.println(num/pow);
            num=num%pow;//make number small 
            pow=pow/10;//make power small
        }
    }
}
