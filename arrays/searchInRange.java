public class searchInRange {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7};
        int target = 5;
        search(arr, target, 1, 4);
    }

    static void search(int[] array, int x, int start , int end) {
        for (int i = start; i < end; i++) {
            if (array[i] == x) {
                System.out.println("Item found at index: " + i);
                break;
            }
        }
    }
}
