package Recursion;

public class NSum {
    public static int calcSum(int n){
        if(n==1)
        return 1;
        // int snm1=calcSum(n-1);
        int sn=n*calcSum(n-1);
        return sn;
    }
    public static void main(String[]args)
    {
       System.out.println(calcSum(10));
    }  
}
