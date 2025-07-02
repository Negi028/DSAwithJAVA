public class fibonacciSeriesRecurs {
    public static void fiboSeries(int secondLastTerm, int LastTerm , int n){
        if(n==0){
            return ;
        }
        int c=secondLastTerm+LastTerm;
        System.out.println(c);
        fiboSeries(LastTerm, c, n-1);
    }
    public static void main(String[] args) {
        int secondLastTerm=0;
        int LastTerm=1;
        int n=7;
        System.out.println(secondLastTerm);
        System.out.println(LastTerm);
        fiboSeries(secondLastTerm, LastTerm, n-2);
    }
}
