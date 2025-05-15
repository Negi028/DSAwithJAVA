//creation of 2d array and insert element until full fill the 2d array
public class arr2d {
    public static void main(String[] args) {
        int count=1;
        int [][] arr2= new int[3][3];
        for(int i=0;i<arr2.length;i++){//this is for row
            for(int j=0;j<arr2[i].length;j++){//ending with length of row
                arr2[i][j]= count;
                count++;
            }
        }
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
