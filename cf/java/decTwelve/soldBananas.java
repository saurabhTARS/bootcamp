package decTwelve;
import java.util.Scanner;

public class soldBananas
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String[] words = s.nextLine().split("\\s");
        
        int k = Integer.parseInt(words[0]);
        long n = Long.parseLong(words[1]);
        int w = Integer.parseInt(words[2]);

        int cost = 0;

        while(w > 0)
        {
            cost += (w*k);
            w--;
        }

        if(cost-n > 0)
            System.out.println(cost-n);
        else 
            System.out.println(0);
        s.close();
        
    }
}