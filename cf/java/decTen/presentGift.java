package decTen;

import java.util.Scanner;

public class presentGift {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        int[] result = new int[n];

        String[] words = s.nextLine().split("\\s");

        while(n > 0)
        {
            result[Integer.parseInt(words[n-1]) - 1] = n;
            n--;
        }

        for(int i = 0; i < words.length; i++)
            System.out.print(result[i] + " ");

        s.close();

    }
}

