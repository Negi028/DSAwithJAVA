public class revStringRecursion {
    static void revString(String str,int index){
        if(index==0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.println(str.charAt(index));
        revString(str, index-1);
    }
    public static void main(String[] args) {
        String str = "AKASH";
        revString(str, str.length()-1);
    }
}
