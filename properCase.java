public class properCase {
    String properCase(String fullname) {
        if (fullname == null || fullname.isEmpty()) {
            return fullname;
        }
        
        String[] words = fullname.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                String firstLetter = words[i].substring(0,1).toUpperCase();
                String restOfWord = words[i].substring(1).toLowerCase();
                result.append(firstLetter).append(restOfWord);
                
                // Add space between words, but not after the last word
                if (i < words.length - 1) {
                    result.append(" ");
                }
            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        properCase pc = new properCase();
        System.out.println(pc.properCase("aKash nEgi"));
    }
}