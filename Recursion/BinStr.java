public class BinStr {
    public static void gen(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        gen(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            gen(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        gen(3, 0, "");
    }
}
