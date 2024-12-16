package _2024_12_10;

import java.util.Scanner;

public class easyHard {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        int result = 0;

        String[] words = s.nextLine().split("\\s");

        while(n > 0)
        {
            result = result | (Integer.parseInt(words[n-1]));
            n--;
        }

        if(result == 1)
            System.out.println("HARD");
        else 
            System.out.println("EASY");
        s.close();
    }
}
