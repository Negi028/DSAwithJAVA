public class countEvenOddINT {
    //single parameter//return in array at -0 index no. of even or at 1 index no. of odd
    static int[] countEvenOdd(int range){
        if(range==0){
            int [] result={0,0};
            return result;
        }
        int [] result=countEvenOdd(range-1);
        if(range%2==0){
            result[0]=result[0]+1;
        }
        else{
            result[1]=result[1]+1;
        }
        return result;
    }
    public static void main(String[] args) {
        int res[]=countEvenOdd(11);
        System.out.println("Even : "+res[0]);
        System.out.println("Odd : "+res[1]);
    }
}
