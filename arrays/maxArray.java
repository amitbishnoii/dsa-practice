import java.util.Arrays;

public class maxArray {
    public static void main(String[] args) {
        int[] arr = {1, 34, 21, 1212, 55};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int current_max = 0;
        for (int i : arr) {
            if (i > current_max) {
                current_max = i;
            }
        }
        return current_max;
    }
}
