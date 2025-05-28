public class sumOfDigituseInt {//stack fallling approach
    static int sumOfdigit(int num){
        if(num==0){
            return 0;//for sum passing initially 0
        }
        int  sum=sumOfdigit(num/10);//it will take you to base case to return initial value of sum 
        int rem=num%10;
        sum=sum+rem;
        return sum;

    }
    public static void main(String[] args) {
        System.out.println(sumOfdigit(1234));

        
        
    }
}
