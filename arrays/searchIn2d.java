public class searchIn2d {
    public static void main(String[] args) {
        int[][] array = {
            {2, 3, 4},
            {5, 6, 7},
            {11, 22, 44},
        };
        int target = 7;
        System.out.println(search(array, target));
    }
    static int search(int[][] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i][j] == x) {
                    return j;
                }
            }
            return i;
        }
        return -1;
    }
}