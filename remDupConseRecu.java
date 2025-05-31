//Q. remove cosecutive duplicate elements from a string like "AAAABBBCCCDCCEE": "ABCDCE"
public class remDupConseRecu {
    static String removeDup(String str){
        if(str.length()<=1){
            return str;
        }
        String smallstr=removeDup(str.substring(1));
        char firstchar=str.charAt(0);
        if(str.charAt(0)==str.charAt(1)){
            //it will skip current addition
            return smallstr;
        }else{
            //include leftmost in string
            return str.charAt(0)+smallstr;

        }
    }
    public static void main(String[] args) {
        String input="AAAAABBBBCCCCDDDCCCCEE";
        System.out.println(removeDup(input));
    }

}
