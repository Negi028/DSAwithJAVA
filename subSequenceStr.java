//take it or not take it approach
public class subSequenceStr {
    static void subSequenceGEn(String str, String result){
        if(str.length()==0){
            System.out.print(result+" , ");
            return;
        }
        //Not take it
        subSequenceGEn(str.substring(1), result);
        //take it
        subSequenceGEn(str.substring(1), result+str.charAt(0));
    }
    public static void main(String[] args) {
        subSequenceGEn("AKASH", "");
    }
}
