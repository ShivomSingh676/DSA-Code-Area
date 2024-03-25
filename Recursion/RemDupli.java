public class RemDupli {
    public static void logic(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        if (map[str.charAt(idx) - 'a'] == true)
            logic(str, idx + 1, newStr, map);
        else {
            map[str.charAt(idx) - 'a'] = true;
            logic(str, idx + 1, newStr.append(str.charAt(idx)), map);
        }
    }

    public static void main(String[] args) {
        logic("philippines", 0, new StringBuilder(""), new boolean[26]);
    }
}