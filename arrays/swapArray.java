import java.util.Arrays;

public class swapArray {
    public static void main(String[] args) {
        int[] arr = {1, 32, 5, 6, 78};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] array, int ind1, int ind2) {
        int temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }
}
