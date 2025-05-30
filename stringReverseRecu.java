public class stringReverseRecu {
    static String stringReverse(String str){
        if(str.length()==0){
            return " ";
        }
        String smallstr=stringReverse(str.substring(1));
        char firstchar=str.charAt(0);
        return smallstr+firstchar;
    }
    public static void main(String[] args) {
        String name="amit";
        System.out.println(stringReverse(name));
        
    }
}
