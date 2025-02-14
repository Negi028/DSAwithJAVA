public class optimiPrime {
    public static void main(String[] args) {
        int num=17;
        for(int i =2;i*i<=num;i++){
            if(num%i==0){
                System.out.println("composite ");
                return;
            }else{
                System.out.println("Prime number");
            }
        }
    }
}
