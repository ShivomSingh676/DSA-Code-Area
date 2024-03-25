
//solving Rain Water problem using Array List!
//Brute Force

import java.util.ArrayList;

public class MaxWaterBrute{
    static int maxWaterArea = 0;

    public static int calculate(ArrayList<Integer> height) {
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int wt = j - i;
                int waterArea = ht * wt;
                if (waterArea > maxWaterArea)
                    maxWaterArea = waterArea;
            }
        }
        return maxWaterArea;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(calculate(list));
    }
}
