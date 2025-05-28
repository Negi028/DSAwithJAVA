public class sumOFDigitreturVoid {
    static void sumOfdigit(int num,int sum){//initially sum value can be taken from parameter
        if(num==0){
            System.out.println("sum is : "+sum);//stack building approach : base case run only one time
            return;
        }
        int digit=num%10;
        sum=sum+digit;
        sumOfdigit(num/10, sum);//make problem smaller and update the value of num and sum
    }
    public static void main(String[] args) {
        sumOfdigit(1234, 0);
    }
}
