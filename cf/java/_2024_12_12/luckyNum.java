package _2024_12_12;
import java.util.Scanner;

public class luckyNum {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        int c = 0;

        long n = Long.parseLong(num);

        while(n > 0)
        {
            long r = n % 10;

            if(r == 4 || r == 7)
                c++;
            n /= 10;
        }

        if(c == 4 || c == 7)
            System.out.println("YES");
        else 
            System.out.println("NO");
        s.close();
    }
}
