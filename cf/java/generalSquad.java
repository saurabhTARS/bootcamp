import java.util.*;

public class generalSquad {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        int[] line = new int[n];
        int i = 0, minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
        int minI = -1, maxI = -1, result = 0;

        String[] words = s.nextLine().split("\\s");
        for(String word : words)
        {
            line[i] = Integer.parseInt(word);

            if(line[i] <= minVal)
            {
                minVal = line[i];
                minI = i;
            }

            if(line[i] > maxVal)
            {
                maxVal = line[i];
                maxI = i;
            }
            i++;
        }

        if(maxI > minI)
            minI++;
        
        result += (maxI + (n-1-minI));
        // System.out.println("maxI : " + maxI + "\n" + "minI : " + minI);
        System.out.println(result);
        s.close();
    }
}
