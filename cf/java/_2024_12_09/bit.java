package _2024_12_09;
import java.util.Scanner;

public class bit
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        int x = 0;

        String userName = myObj.nextLine();
        try 
        {
            int numRows = Integer.parseInt(userName);
            // System.out.println("The input was : " + numRows);

            for(int i = 0; i < numRows; i++)
            {
                String operation = myObj.nextLine();

                if(operation.contains("++"))
                    x++;
                else if(operation.contains("--"))
                    x--;
            }

            System.out.println(x);

        }
        catch(Exception e)
        {
            // System.out.println("The input is not an integer : " + userName);
            System.exit(0);
        }
        myObj.close();
    }
}
