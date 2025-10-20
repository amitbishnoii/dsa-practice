public class searchInStrings {
    public static void main(String[] args) {
        String name = "avrit";
        char chr = 'a';
        System.out.println(search(name, chr));
    }

    static boolean search(String str, char x) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == x) {
                return true;
            }
        }
        return false;
    }
}
