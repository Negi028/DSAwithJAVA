//return min and max in array form 0index min and 1 index max
public class minAndMaxrec {
    static int [] minandMaxelement(int arr[],int index){
        if(index==arr.length){
            int[] result=new int[2];
            result[0]=Integer.MAX_VALUE;
            result[1]=Integer.MIN_VALUE;
            return result;
        }
        int result[]=minandMaxelement(arr, index+1);
        if(result[0]>arr[index]){
            result[0]=arr[index];
        }else if(result[1]<arr[index]){
            result[1]=arr[index];
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={2,4,3,5,90,1,0};
        int res[]=minandMaxelement(arr, 0);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
