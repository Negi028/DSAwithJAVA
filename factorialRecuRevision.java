public class factorialRecuRevision{
    static int fact(int num,int fact){
        if(num==1 || num==0){
            return 1;
        }
        int  factN_1=fact(num-1,fact);
        fact=num*factN_1;
        return fact;
    }
    public static void main(String[] args) {
        int result  =fact(3, 1);
        System.out.println("factorial is : "+result);
        
    }
}
