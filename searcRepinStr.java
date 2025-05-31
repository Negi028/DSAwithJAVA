//Q. replace l with x "INPUT : HELLO" "OUTPUR : HEXXO"
public class searcRepinStr {
    static String replaceStr(String str){
        if(str.length()==0){
            return "";
        }
        String smallstr=replaceStr(str.substring(1));
        char firstchar=str.charAt(0);
        if(str.charAt(0)=='l'||str.charAt(0)=='L'){
            
            return "x"+smallstr;
        }
        else{
            return firstchar+smallstr;
        }
        
    }
    public static void main(String[] args) {
        String greet="HELLO";
        System.out.println(replaceStr(greet));
        
    }
}
