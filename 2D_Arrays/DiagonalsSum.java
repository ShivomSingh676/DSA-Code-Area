public class DiagonalsSum
{
    public int dSumBrute(int matrix[][])//O(n^2)
    {
        int sum=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(i==j)
                sum+=matrix[j][j];
                else if((i+j)==matrix[0].length-1)
                sum+=matrix[i][j];
            }
        }
        return sum;
    }
    public int dSumOpt(int matrix[][])//O(n)
    {
        int sum=0;
        for(int i=0;i<matrix.length;i++)
        {
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i)
            sum+=matrix[i][matrix[0].length-1-i];
        }
        return sum;
    }
    public static void main(String[]args)
    {
        DiagonalsSum DS=new DiagonalsSum();
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int sumB=DS.dSumBrute(matrix);
        int sumO=DS.dSumOpt(matrix);
        System.out.println("Brute Force sum: "+sumB);
        System.out.println("Optimised sum: "+sumO);
    }
}