public class factorialRecu {
    static int fact(int num){
        if(num==0){
            return 1;
        }
        int result=fact(num-1);
        result=result*num;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(fact(3));
    }
}
