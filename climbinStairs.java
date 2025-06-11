//reach top of stairs at n , you either taake 1 or 2 steps for reaching at top find all total ways you can reach at top
public class climbinStairs {
    static int climbin(int n){
        if(n<=1){
            return 1;
        }
        int count1=climbin(n-1);
        int count2=climbin(n-2);
        return count1+count2;

    }
    public static void main(String[] args) {
        int ways=climbin(3);
        System.out.println("there are "+ways +" ways to reach at top");
    }
}//time limit exceeded error in coding platform so we will use dp to this questionn
