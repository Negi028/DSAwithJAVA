public class searchElementRec {
    static boolean searchElement(int [] array,int index,int search){
        if(index==array.length){
            return false;
        }
        if(array[index]==search){
            return true;
        }
        return searchElement(array, index+1, search);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,50,40};
        int search=50;
        int index=0;
        System.out.print(searchElement(arr, index, search)?"element found":"not Found");
    }
}
