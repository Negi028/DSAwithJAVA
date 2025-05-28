public class printTableRecu {
    static void printTable(int num,int end){
        if(end==0){
            return ;
        }
        printTable(num, end-1);
        System.out.println(num+" X "+end+" = "+num*end);

    }
    public static void main(String[] args) {
        printTable(5, 10);
        
    }
}
