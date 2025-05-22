//permutation means is both arrays elements are same or not? check it 
public class Exercise {
    public static boolean permutation(int[] array1, int[] array2){
        // TODO
        boolean permutation=true;
        int sum1=0;
        int pro1=1;
        for(int i=0;i<array1.length;i++){
            sum1=sum1+array1[i];
            pro1=pro1*array1[i];
        }
        int sum2=0;
        int pro2=1;
          for(int i=0;i<array2.length;i++){
            sum2=sum2+array2[i];
            pro2=pro2*array2[i];
        }
        if(sum1==sum2 && pro2==pro1){
            permutation=true;
        }else{
            permutation=false;
        }
        return permutation;
    }
    public static void main(String[] args) {
        int [] arr1={10,20,30,40};
        int [] arr2={20,10,30,40};
        boolean per= permutation(arr1,arr2);
        System.out.println("is same elements are in array ? "+per);

        
    }

}

