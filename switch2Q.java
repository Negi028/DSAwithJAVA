//switch case can't return ans. but possible
// use arrow at case for return result
//user input for 1.tea 2.coffee 3.drink
//this would be switch case result 
public class switch2Q {
    public static void main(String[] args) {
      int ch=1;
      String result= switch(ch){
        case 1 -> "rs 50";
        case 2 -> "rs 100";
        case 3-> {
            int c=100;
            int d= c*c;
            yield "rs 150";
        }
        default->"wrong choice";
      };
      
        
    }
    
}
