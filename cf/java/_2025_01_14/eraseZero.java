package _2025_01_14;
import java.util.Scanner;
import java.util.Stack;

public class eraseZero {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());

        while(t > 0)
        {
            String str = s.nextLine();
            int result = 0, count = 0;
            Stack<Character> stk = new Stack<>();

            for(Character c : str.toCharArray())
            {
               if(c == '1' && stk.isEmpty())
                stk.push(c);
               else if(c == '1' && !stk.isEmpty() && stk.peek() == '1')
               {
                result += count;
                count = 0;
               }
               else if(c == '0' && !stk.isEmpty() && stk.peek() == '1')
                {
                    count++;
                }
            }
            t--;
            System.out.println(result);
        }
        s.close();
    }
}
