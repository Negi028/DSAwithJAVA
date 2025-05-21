
import java.util.Arrays;

public class isduplArr {
    public static int[] remduplicate(int array[]){
        int  n= array.length;
        int  uniquearr[]=new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            boolean isdup=false;
            for(int j=i+1;j<n;j++){
                if(array[i]==array[j]){
                    isdup=true;
                    break;
                }
            }
            if(!isdup){
                uniquearr[index++]=array[i];
            }
        }
        return Arrays.copyOf(uniquearr,index);
    }
    public static void main(String[] args) {
        int arr[]={10,10,24,25,18,18};
        int uniquearray[]=remduplicate(arr);
        System.out.println(Arrays.toString(uniquearray));
    }
    
}
