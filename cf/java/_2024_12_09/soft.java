package _2024_12_09;

import java.util.Scanner;

public class soft
{
    public static void main(String[] args)
    {
        // slices = c * d 
        // drink = nl + d + np + 
        // total drink = k * l 
        // one drink = nl + d + np
        // salt = p grams

        // n, k, l, c, d, p, nl, np,
        // 0, 1, 2, 3, 4, 5, 6, 7

        int[] params = new int[8];
        int i = 0;

        Scanner myObj = new Scanner(System.in);

        String input = myObj.nextLine();

        String[] words = input.split("\\s");

        for(String word : words)
        {
            params[i++] = Integer.parseInt(word);
        }

        int drink = (params[1] * params[2]) / (params[6] * params[0]);
        int slice = (params[3] * params[4]) / params[0];
        int salt = (params[5]) / (params[7] * params[0]);

        System.out.println(Math.min(Math.min(drink, slice), salt));
        myObj.close();
        // System.out.println(params[0]);
    }
}