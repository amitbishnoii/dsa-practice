import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int [] arr = {2, 3, 4, 5, 34, 32, 1};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    static int[] reverse(int[] arr) {
        int [] reverse_arr = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse_arr[j] = arr[i];
            j++;
        }
        return reverse_arr;
    }
}
