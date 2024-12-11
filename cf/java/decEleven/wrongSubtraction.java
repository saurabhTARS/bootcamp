package decEleven;
import java.util.Scanner;

public class wrongSubtraction {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String[] words = s.nextLine().split("\\s");

        long num = Long.parseLong(words[0]);
        int sub = Integer.parseInt(words[1]);

        while(sub > 0)
        {
            if(num % 10 != 0)
                num--;
            else 
                num = num/10;
            sub--;
        }

        System.out.println(num);
        s.close();
    }
}
