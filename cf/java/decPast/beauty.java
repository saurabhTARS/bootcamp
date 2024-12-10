package decPast;
import java.util.Scanner;
import java.lang.Math;

public class beauty
{
    public static void main(String[] args)
    {
        int[][] nums = new int[5][5];
        int row = 0;
        int column = 0;
        Scanner myObj = new Scanner(System.in);

        for(int i = 0; i < 5; i++)
        {   int j = 0;
            String numsj = myObj.nextLine();

            for(char num : numsj.toCharArray())
            {
                if(Character.isDigit(num))
                {
                    nums[i][j] = Character.getNumericValue(num);
                    if(nums[i][j] == 1)
                    {
                        row = i;
                        column = j;
                    }
                    j++;
                }
            }  
        }

        int result = Math.abs(2 - row) + Math.abs(2 - column);

        System.out.println(result);
        myObj.close();
    }
}