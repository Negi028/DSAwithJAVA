public class linearSearch {
    public static int linearSearc(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int numbers[]={10,20,30,40,18,45,95};
        int key=18;
        int indexPrint=linearSearc(numbers, key);
        if(indexPrint==-1){
            System.out.println("KEY NOT FOUND ON ANY INDEX ");
        }else{
            System.out.println("FOUND AT INDEX "+indexPrint);
        }
    }
}
