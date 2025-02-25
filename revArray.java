public class revArray {
    public static void reverse(int[] arr) {
        // Print elements in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 24, 45, 65, 87};
        reverse(arr);
    }
}