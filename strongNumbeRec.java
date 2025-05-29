//Q. strong number is 145 = 1!+4!+5!=145
public class strongNumbeRec {
    static int fact(int num){
        if(num==0){
            return 1;
        }
        int res=fact(num-1);
        res=res*num;
        return res;
    }
    static void strongNumber(int num,int result, int cpy){
        if(num==0){
            System.out.println(cpy==result?"Strong Number":"Not A Strong Number");
            return;
        }
        int rem=num%10;
        int factorial=fact(rem);
        result=result+factorial;
        strongNumber(num/10, result, cpy);
    }
    public static void main(String[] args) {
        int num=142;
        int cpy=num;
        strongNumber(num, 0, cpy);
    }
    
}
