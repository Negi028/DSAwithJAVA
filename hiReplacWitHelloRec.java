//q. replace hi with hello in string
public class hiReplacWitHelloRec {
    static String replaceHi(String str){
        if(str.length()<=1){
            return str;
        }
        char firstchar=str.charAt(0);
        if(str.charAt(0)=='h' &&  str.charAt(1)=='i'){
            String smallstr=replaceHi(str.substring(2));
            return "hello"+smallstr;
        }
        else{
            String smallstr= replaceHi( str.substring(1));
            return firstchar+smallstr;
        }
    }
    public static void main(String[] args) {
        String greet="hi akash hi akank";
        System.out.println(replaceHi(greet));
        
    }
}
