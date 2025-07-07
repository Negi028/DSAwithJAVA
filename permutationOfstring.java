public class permutationOfstring {
    static void genPermStr(String str,String output){
        if(str.length()==0){
            System.out.println(output);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currentChar=str.charAt(i);
            String remString=str.substring(0,i)+str.substring(i+1);
            genPermStr(remString, output+currentChar);

        }
    }
    public static void main(String[] args) {
        String str="akash";
        genPermStr(str, "");
        
    }
}
