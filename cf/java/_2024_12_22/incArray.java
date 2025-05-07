package _2024_12_22;
import java.util.Scanner;

public class incArray 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(s.nextLine());
        int i = 0;
        long prev = Long.MAX_VALUE;
        int result = 0, m = 0;
        String[] words = s.nextLine().split("\\s");

        while(n > 0)
        {
            long val = Long.parseLong(words[i++]);
            
            if(val <= prev)
            {
                result = 1;
            }
            else 
                result++;
            prev = val;
            if(result > m)
                m = result;
            n--;
        }
        System.out.println(m);
        s.close();
    }
}
