package decPast;
import java.util.Scanner;

public class chew
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        String nums = myObj.nextLine();
        StringBuilder result = new StringBuilder("");

        for(char num : nums.toCharArray())
        {
            int digit = Character.getNumericValue(num);
            
            if((9-digit) < digit)
            {
                result.append((9-digit));
            }
            else
            {
                result.append(digit);
            }

        }
        if(Character.getNumericValue(result.charAt(0)) == 0)
            result.setCharAt(0, nums.charAt(0));
        System.out.println(result);
    }
}