package _2025_01_03;
import java.util.Scanner;

public class cardGame 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String table = s.nextLine();
        String[] hand = s.nextLine().split("\\s");

        int flag = 0;

        for(int i = 0; i < 5; i++)
        {
            if(table.charAt(0) == hand[i].charAt(0) || table.charAt(1) == hand[i].charAt(1))
            {
                flag = 1;
                break;
            }
        }

        if(flag == 0)
            System.out.println("NO");
        else 
            System.out.println("YES");
        s.close();
    }
}