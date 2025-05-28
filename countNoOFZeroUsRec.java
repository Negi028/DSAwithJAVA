public class countNoOFZeroUsRec{
    static int countNoofZero(int num){
        if(num==0){
            return 0;
        }
        int count=countNoofZero(num/10);
        if(num%10==0){
            count=count+1;
        }
        return count;
    }
    public static void main(String[] args) {
        int num=100200;
        System.out.println(countNoofZero(num));
        
    }

}