package _2024_12_16;
import java.util.Scanner;
// 15 12409 160767

public class cPlus {
    public static void main(String[] args)
    {
        Scanner s  = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());

        while(t > 0)
        {
            String[] words = s.nextLine().split("\\s");
            long a = Long.parseLong(words[0]);
            long b = Long.parseLong(words[1]);
            long n = Long.parseLong(words[2]);

            int toggle = -1, count = 0;

            if(a < b)
                toggle = 1;

            while(a <= n && b <= n)
            {
                if(toggle == 1)
                    a += b;
                else 
                    b += a;
                toggle *= -1;
                count++;
                // System.out.println("count : " + count);
                // System.out.println("a : " + a);
                // System.out.println("b : " + b);
                // System.out.println();
                // System.out.println("a : " + a);
                // System.out.println("a : " + a);
            }

            System.out.println(count);
            t--;
        }
        s.close();
    }
}
