//begining of arrays
public class arrays {
    
    public static void main(String[] args) {
        //int[] marks= new int[3]; smae works brckets doesnt matter
        int marks[]= new int[3];
        marks[0]=97;
        marks[1]=98;
        marks[2]=100;

        //for accessing array elements we will use loop
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
    }
}
