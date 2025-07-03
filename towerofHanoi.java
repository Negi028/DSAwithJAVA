public class towerofHanoi {
    static void twrOfHanoi(int n,String src,String helper,String Dest){
        if(n==1){
           System.out.println("Move disk "+n+" "+ src +" "+"to"+" "+ Dest); 
           return;
        }
        twrOfHanoi(n-1, src, Dest, helper);
        System.out.println("Move disk "+n+" "+ src +" "+"to"+" "+ Dest);
        twrOfHanoi(n-1, helper, src, Dest);
    }
    public static void main(String[] args) {
        int n=3;
        twrOfHanoi(n, "SOURCE", "HELPER", "DESTINATION");
    }
}
