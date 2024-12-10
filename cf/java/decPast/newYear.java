package decPast;
import java.util.*;

public class newYear {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        String input = myObj.nextLine();
        String[] words = input.split("\\s");
        int[] nums = new int[3];
        int i = 0;

        for(String word : words)
        {
            nums[i++] = Integer.parseInt(word);
        }
        i = 0;
        int result = Integer.MAX_VALUE;

        while(i < 3)
        {
            if(i == 0)
            {
                result = Math.min(Math.abs(nums[0] - nums[1]) + Math.abs(nums[0] - nums[2]), result);
                // System.out.println(result);
            }
            if(i == 1)
            {
                result = Math.min(Math.abs(nums[0] - nums[1]) + Math.abs(nums[1] - nums[2]), result);
                // System.out.println(result);
            }
            if(i == 2)
            {
                result = Math.min(Math.abs(nums[0] - nums[2]) + Math.abs(nums[1] - nums[2]), result);
                // System.out.println(result);
            }
            i++;
        }

        System.out.println(result);
        myObj.close();
    }
}
