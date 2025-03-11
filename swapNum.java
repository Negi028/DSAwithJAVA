//pass by value : no changes reflect due to it makes copy of variables
//pass by reference: direct changes on actual arguements from formal arguements : it directly points to original value
class Temp{
    int myvar;
}
public class swapNum {
    
    public static void main(String[] args) {
        swapNum mf=new swapNum();
        
        Temp obj1 = new Temp();
        Temp obj2 = new Temp();
        obj1.myvar=10;
        obj2.myvar=20;
        mf.swapnumbyReference(obj1, obj2);
        System.out.println("AFTER CALL : "+obj1.myvar+","+obj2.myvar);
        
    }
    public void swapnumbyReference(Temp obj1,Temp obj2){
        int temp=obj1.myvar;
        obj1.myvar=obj2.myvar;
        obj2.myvar=temp;

    }

}
