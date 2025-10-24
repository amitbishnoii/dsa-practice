import java.util.Arrays;
// leetcode-1
public class twoSum {
    public static void main(String[] args) {
        int[] arr= {-1,-2,-3,-4,-5};
        int target = -8;
        System.out.println(Arrays.toString(twosum(arr, target)));
    }

    static int[] twosum(int[] array, int x) {
        int[] indices = new int[2];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println("value of i is " + i);
                System.out.println("value of j is " + j);
                if (array[i] + array[j] == x) {
                    indices[0] = j;
                    indices[1] = i;
                    break;
                }
            }
        }
        return indices;
    }
}
