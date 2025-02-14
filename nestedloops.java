public class nestedloops {
    public static void main(String[] args) {
        //labelled loop
        outer:
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                if(i==j){
                    //break;
                    //continue;
                    //return;
                    continue outer;
                }
                System.out.println("I is "+i+"J is"+j);
                

            }
        }
    }
}
