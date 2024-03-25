public class StaircaseSearch2 
{
    public boolean findKey(int matrix[][],int key)
    {
        int row=matrix.length-1;
        int col=0;
        while(row>=0&&col<matrix[0].length-1)
        {
            if(matrix[row][col]==key)
            {
                System.out.println("Key found at: "+"("+row+","+col+")");
                return true;
            }
            else if(matrix[row][col]>key)
            {
                --row;
            }
            else
            {
                col++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }
    public static void main(String[]args)
    {
        StaircaseSearch2 stair=new StaircaseSearch2();
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        stair.findKey(matrix, 30); 
    }
    
}
