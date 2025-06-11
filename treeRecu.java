//working of tree recursion
public class treeRecu {
    static void func(int num){
        if(num<=0){
            return;
        }
        System.out.println("precall "+num);
        func(num-1);
        System.out.println("mid call "+num);
        func(num-2);
        System.out.println("post call "+num);
    }
public static void main(String[] args) {
    func(3);
}
}

