import java.math.BigInteger;

public class datatype {
    public static  void main(String[] args) {
        int x = 10;
        System.out.println(x + 10);
        System.out.println(x);

        long timeInms=645554526L;
        //type casting : when out of size capacity range
        byte age=20;//byte literal
        byte r= (byte)130;
        System.out.println(r);

        byte w=100;
        byte w2=2;
        byte w3= (byte)(w+w2);
        System.out.println(w3);
       


        float p= 90.20f;//double in float convert
        double p1= 90.4562;//highly precision

    
        String n="Akash";//reference ,pass by reference,object address in heap memory
        
        BigInteger b1= new BigInteger("4566658756423654136626642261233");
        BigInteger b2= new BigInteger("659554263466988665565636636625");
        BigInteger b3= b1.add(b2);
        System.out.println(b3);

        //object==> data +methods
        //wrapper type Float , Double,Character,Boolean,
        //wrapper java inbuilt ds
    }
    
}
//data type 
//primitive value/value type /immutable
//non pr value/reference type
//range calculataion  , 1 byte=8bits ; 1 bit for sign (+,-)
//2power range - 2power range -1
//non decimal (byte , short , int , long)
//you can not apply arithmetic operation in byte but by forcefully
//strictfp - iee-754 floating standard pint
// decimal ,boolean ,char
//string - colllection of character, char[],wrapper class
//big integer no arithmetic operation due to reference plus reference