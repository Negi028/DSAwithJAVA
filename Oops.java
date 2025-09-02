//OBJECT ORIENTED PROGRAMMING
//1> USER DEFINED DATA TYPE
//CLASSES : CREATION OF A NEW DATA TYPE FOR STORING MULTIPLE ATTRIBUTES
public class Oops{
    //creating a new data type
    public static class Student{//outside of main function thats why we can use it all over or update it
        String Name;
        int roll_no;
        double PERCENTAGE;
    }
    public static void main(String[] args) {
        Student stu= new Student();
        stu.Name="AKASH";
        stu.roll_no=28;
        stu.PERCENTAGE=90.8;
        System.out.println(stu.Name);
    }
}