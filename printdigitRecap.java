//print digit 12345 output must be in form
/* 1
 * 2
 * 3
 * 4
 * 5
 */
public class printdigitRecap {
    public static void main(String[] args) {
        int num=12345;
        int cpy=num;//copy of number that num cant be destroyed
        int count=0;//counting digit of number
        while(cpy!=0){
            count++;
            cpy=cpy/10;
        }
        while(num!=0){
            int pow=(int)Math.pow(10, count-1);
            int digits=num/pow;
            System.out.println(digits);
            num=num%pow;
            count--;
        }
        
    }
}
