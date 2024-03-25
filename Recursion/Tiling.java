public class Tiling{
    public static int ways(int n){
        if(n==0||n==1)
        return 1;
        // int fnm1=ways(n-1);
        // int fnm2=ways(n-2);
        return ways(n-1)+ways(n-2);
    }
    public static void main(String[] args) {
        System.out.println(ways(4));
    }
}