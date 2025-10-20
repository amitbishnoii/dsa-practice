public class findMax {
    public static void main(String[] args) {
        int[] arr = {2, 33, 4, 5, 6, 7};
        System.out.println(max(arr));
        
    }

    static int max(int[] arr) {
        int maxInt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxInt) {
                maxInt = arr[i];
            }
        }
        return maxInt;
    }
}
