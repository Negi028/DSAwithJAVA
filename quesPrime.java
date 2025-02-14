public class quesPrime {
    public static void main(String[] args) {
        int num=24;
        int factorcount=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                factorcount++;
            }
            if(factorcount==2){
                System.out.println("prime number");
                break;

            }else{
                System.out.println("composite number");
                break;
            }
        }
    }
}
