import java.util.ArrayList;

public class PairSum1 {
    public static boolean isPresent(ArrayList<Integer>numbers,int target){
        int bp=breaking(numbers);
        int lp=bp+1;
        int rp=bp;
        int n=numbers.size();
        while(lp!=rp){
            if((numbers.get(lp)+numbers.get(rp))==target)
            return true;
            else if((numbers.get(lp)+numbers.get(rp))<target)
            lp=(lp+1)%n;
            else
            rp=(n+rp-1)%n;
        }
        return false;
    }
    public static int breaking(ArrayList<Integer>list){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(isPresent(list, 56));
    }
}
