package decPast;
import java.util.*;

public class balancedRating {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());

        int toggle = -1;

        while(n > 0)
        {
            int num = Integer.parseInt(s.nextLine());

            if(num%2 != 0 && toggle == -1)
            {
                System.out.println((int)Math.floor(((double)num)/2));
                toggle = 1;
            }
                
            else if(num%2 != 0 && toggle == 1)
            {
                System.out.println((int)Math.ceil(((double)num)/2));
                toggle = -1;
            }
            else 
                System.out.println(num/2);
            // toggle *= -1;
            n--;
        }


        s.close();
    }
}
