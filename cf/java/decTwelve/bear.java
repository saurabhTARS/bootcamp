package decTwelve;
import java.util.Scanner;

public class bear
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String[] words = s.nextLine().split("\\s");
        
        int a = Integer.parseInt(words[0]);
        int b = Integer.parseInt(words[1]);
        int year = 0;

        while(a <= b)
        {
            a *= 3;
            b *= 2;
            year++;
        }
        System.out.println(year);
        s.close();
        
    }
}