//scanner is a buffer is empty space
//input is from system.in
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        
        int wordCount=0;
        Scanner scanner= new Scanner("how are you??");
        while(scanner.hasNext()){
            wordCount++;
            System.out.println(scanner.next());
        }
        System.out.println("total words are"+wordCount);
        scanner.close();
    }
}
