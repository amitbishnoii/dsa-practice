public class linearSearch {
    public static void main(String[] args) {
        int[] arr = { 12, 34, 1, 54, 22 };
        search(arr, 54);
    }

    public static void search(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println("Item found at index: " + i);
                break;
            }
        }
    }
}
