//with return type firstly it need to store then we can use it
public class myfunc {
    public static void main(String[] args) {
        myfunc mf=new myfunc();
        int res=mf.calculateArea(10, 45);
        System.out.println("area is "+res);    
    }
    public int calculateArea(int length,int breadth){
        int area=length*breadth;
        return area;
    }
}
