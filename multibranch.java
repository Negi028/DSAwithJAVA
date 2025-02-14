public class multibranch {
    static  void show(int num){
        if(num<=0){
            return;
        }
        System.out.println(num);
        //multibranch(recursive call n times)
        show(num-1);
        show(num-2);

    }
    public static void main(String[] args) {
        show(4);
    }
}
