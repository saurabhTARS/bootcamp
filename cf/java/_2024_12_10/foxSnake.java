package _2024_12_10;
import java.util.*;

public class foxSnake {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        String input = myObj.nextLine();
        String[] words = input.split("\\s");

        int n = Integer.parseInt(words[0]);
        int m = Integer.parseInt(words[1]);
        int toggle = 1;

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(i % 2 == 0)
                    System.out.print("#");
                else if(toggle == -1 && j == m-1)
                    System.out.print("#");
                else if(toggle == 1 && j == 0)
                    System.out.print("#");
                else
                    System.out.print(".");

            }
            System.out.print("\n");
            if(i % 2 == 0)
                toggle *= -1;
        }
        myObj.close();
    }
}
