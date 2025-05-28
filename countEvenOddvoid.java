//count even or odd from 1 to N range using stack building approach in stack building approach in pre logic is initially initaitedd
public class countEvenOddvoid {
    static void countEvenOdd(int range,int even,int odd){
        if(range==0){
            System.out.print("EVEN : "+even+" ODD : "+odd);
            return;
        }
        //pre logic
        if(range%2==0){
            even++;
        }
        else{
            odd++;
        }
        countEvenOdd(range -1, even, odd);
    }
    public static void main(String[] args) {
        countEvenOdd(11, 0, 0);
    }
}
