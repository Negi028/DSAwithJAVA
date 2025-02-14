public class agaainqwithswap {
    public static void main(String[] args) {
        int num=32145;
        int sum=0;
        int pos=0;
        while(num>0){
            int digit=num%10;
            pos++;
            int val=pos*(int)Math.pow(10,digit-1);
            sum=sum+val;
            num=num/10;

        }
        System.out.println(sum);
    }
}
