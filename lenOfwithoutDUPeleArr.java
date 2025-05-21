//optimized way of finding length of sorted array which have duplicate elements
public class lenOfwithoutDUPeleArr {
    public static int lenArrWOdup(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];//store for further comparision
            }
        }
        return i+1;//actual length of array
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,4,6,6};
        System.out.print(lenArrWOdup(arr));
    }
}

