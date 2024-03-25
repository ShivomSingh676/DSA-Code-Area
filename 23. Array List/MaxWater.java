//Calculating the stored water using ArrayList using a better approach!
// Time Complexity: O(n)
import java.util.ArrayList;

public class MaxWater {
    public static int waterArea(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int wt = rp - lp;
            int currWater = ht * wt;
            maxWater = Math.max(maxWater, currWater);
            if (height.get(lp) < height.get(rp))
                lp++;
            else
                rp--;
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(8);
        list.add(3);
        list.add(10);
        System.out.println(waterArea(list));
    }
}