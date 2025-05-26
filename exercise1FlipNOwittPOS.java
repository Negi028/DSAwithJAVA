//q.pos: 5  4  3  2  1
//digit: 3  2  1  4  5
//output:1  2  5  4  3
public class exercise1FlipNOwittPOS {
    public static void main(String[] args) {
        int num=32145;//flip with position like 5 is in 1st position flip it in 1st position
        int pos=0;
        int sum=0;
        while(num!=0){
        int singleDigit= num%10;
        pos++;
        int power=(int)Math.pow(10,singleDigit-1);//10^4
        sum=sum+pos*power;
        num=num/10;
        }
        System.out.println(sum);
    }
}
