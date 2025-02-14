//menu driven and equality comparision and default fall - to stop this fall use break; keyword
//switch with string using input possible
public class switch1 {
    public static void main(String[] args) {
        System.out.println("1. tea");
        System.out.println("2. coffee");
        System.out.println("3. burger");
        System.out.println("4. pizza");

        int choice=2;
        switch (choice) {
            case 1:
                System.out.println("rs 20");
                break;
            case 2:
                System.out.println("rs 100");
                break;
            case 3:
                System.out.println("rs 150");
                break;
            case 4:
                System.out.println("rs 200");
                break;
            default:
                System.out.println("wrong choices");
        }
    }
    
}
