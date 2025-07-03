public class firstandlastocc {
    public static int  first=-1;
    public static int last=-1;
    static void firstAndLastOccurence(String str,int index,char element){
        if(index==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(str.charAt(index)==element){
            if(first==-1){
                first=index;
            }else{
                last=index;
            }
        }
        firstAndLastOccurence(str, index+1, element);


    }
    public static void main(String[] args) {
        String str="aaabbbbbaccbca";
        char element='a';
        firstAndLastOccurence(str, 0, element);
    }
}
