//only focus on non zero element initially arrange them
public class moveZeroLast {
    public static void moveZerotoLastarray(int array[]){
        int index=0;//for tracking the non zero element position and assign them after remaing will be zero
        for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                array[index]=array[i];//pehla non zero aayega index=0 mae isllye use kiya not in iteration
                index++;
            }
        }
        while(index<array.length){
            array[index]=0;
            index++;
        }

    }
    public static void main(String[] args) {
        int arr[]={0,10,14,0,45,0,78};
        moveZerotoLastarray(arr);
        for(int value:arr){
            System.out.print(value+" ");
        }
    

        
    }
    
}
