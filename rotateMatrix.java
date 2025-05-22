//Leetcode rotation of matrix 90 degree : transpose and reverse row
class rotateMatrix {
    public static  void rotate(int[][] matrix) {
        int n= matrix.length;
        //transpose of mar=trix: makin row to column and column to row
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;

            }
        }
        //reverse row with left and right
        for(int i=0;i<n;i++){
            int left=0;
            int right=n-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
      int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
      System.out.println("before 90 degree rotation ");
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
          System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
      rotate(arr);
      System.out.println("after 90 degree rotation ");
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
          System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
    }
}

