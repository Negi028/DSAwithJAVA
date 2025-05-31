public class printAdjacentStarDup {
    static String printStar(String str){
        if(str.length()<=1){
            return str;
        }
        String smallstr=printStar(str.substring(1));
        if(str.charAt(0)==str.charAt(1)){
            return str.charAt(0)+"*"+smallstr;
        }else{
            return str.charAt(0)+smallstr;
        }
    }
    public static void main(String[] args) {
        String input="AABCCD";
        System.out.println(printStar(input));
    }
}
