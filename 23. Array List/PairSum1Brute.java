import java.util.ArrayList;
public class PairSum1Brute {
    public static boolean isPresent(ArrayList<Integer>numbers, int target){
        for(int i=0;i<numbers.size();i++){
            for(int j=i+1;j<numbers.size();j++){
                if((numbers.get(i)+numbers.get(j))==target)
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(isPresent(list, 54));
    }
}
