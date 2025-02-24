//PASSING ARRAY AS ARGUEMENT : call by reference array show updation reflection on main function to show this we have a program
public class passArrAsArgu {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};
        update(marks);
        //for accessing 
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
    }
}
