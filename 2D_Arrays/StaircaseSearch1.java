public class StaircaseSearch1
{
    public boolean findKey(int matrix[][],int key)
    {
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length&&col>=0)
        {
            if(matrix[row][col]==key)
            {
                System.out.println("Key found at "+"("+row+","+col+")");
                return true;
            }
            else if(matrix[row][col]>key)
            {
                --col;
            }
            else
            {
                ++row;
            }
        }
        System.out.println("Key not found!");
        return false;
    }
    public static void main(String[]args)
    {
        StaircaseSearch1 stair=new StaircaseSearch1();
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        stair.findKey(matrix, 29);               
    }
}