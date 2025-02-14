public class printno {
    static void show(int num){
        //Termination case
        if(num==0){
            return;//exit from current function
        }

        //System.out.println(num);
        //small problem
        show(num-1);
        System.out.println(num);

    }
    public static void main(String[] args) {
        show(5);
    }
}
