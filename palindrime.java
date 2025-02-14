public class palindrime {
    static void palindrome(int num,int org,int result){
        if(num==0){
            System.out.println(org==result ? "palindrome":"not palindrome");
            return;
        }
        int rem=num%10;
        result=result*10+rem;
        palindrome(num/10, org, result);

    }
    public static void main(String[] args) {
        int num=151;
        palindrome(num, num, 0);
    }
}
