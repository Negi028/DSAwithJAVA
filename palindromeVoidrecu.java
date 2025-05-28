public class palindromeVoidrecu {
    //is 151 == 151 true after reversing it
    static void isPalindrome(int num, int rev,int cpy){
        if(num==0){
            System.out.println(cpy==rev?" Palindrome number":"not a palindrome");
            return;
        }
        int rem=num%10;
        rev=rev*10+rem;
        isPalindrome(num/10, rev, cpy);
    }
    public static void main(String[] args) {
        int num=259;
        int cpy=num;
        isPalindrome(num, 0, cpy);
        
    }
}
