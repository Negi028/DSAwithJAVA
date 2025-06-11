public class ropeCut {
    static int maxCut(int ropeLen,int a,int b,int c){
        if(ropeLen==0){
            return 0;
        }if(ropeLen<0){
            return -1;
        }
        int option1=maxCut(ropeLen-a, a, b, c);
        int option2=maxCut(ropeLen-b, a, b, c);
        int option3=maxCut(ropeLen-c, a, b, c);
        int finalres=Math.max(Math.max(option1, option2),option3);
        if(finalres<-1){
            return -1;
        }
        return finalres+1;
    }
    public static void main(String[] args) {
        int res=maxCut(5, 3, 5, 1);
        System.out.println(res);
    }
}
