package decEleven;
import java.util.Scanner;

public class tram {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        int capacity = 0;
        int totalPassengers = 0;

        while(n > 0)
        {
            String[] words = s.nextLine().split("\\s");
            int exit = Integer.parseInt(words[0]);
            int enter = Integer.parseInt(words[1]);

            totalPassengers += (enter-exit);

            if(totalPassengers > capacity)
                capacity = totalPassengers;
            n--;
        }
        System.out.println(capacity);
        s.close();
    }
}
