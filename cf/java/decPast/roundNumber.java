package decPast;
import java.util.*;

public class roundNumber {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        int t = Integer.parseInt(myObj.nextLine());

        while(t > 0)
        {   
            String nums = myObj.nextLine();
            ArrayList<Integer> round = new ArrayList<>();
            int numLen = nums.length()-1;

            for(Character c : nums.toCharArray())
            {   
                int val = Character.getNumericValue(c) * (int)Math.pow(10, numLen--);
                if(val > 0)
                    round.add(val);
            }
            t--;
            System.out.println(round.size());
            System.out.println(round.toString().replace(",", "").replace("[", "").replace("]", ""));
        }
        myObj.close();
    }
}
