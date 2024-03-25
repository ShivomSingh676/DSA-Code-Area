// package String;
public class Palindrome {
    public boolean logicP(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = args[1];
        Palindrome pal = new Palindrome();
        System.out.println(pal.logicP(str));
    }
}
