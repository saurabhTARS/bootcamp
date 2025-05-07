package _2025_01_03;

import java.util.Scanner;


public class cubicalPyra {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int cubes = Integer.parseInt(s.nextLine());
        int height = 0;
        int used = 0;
        int usedCubes = 0;
        int result = 0;

        while(true)
        {
            if((cubes - used) <= 0)
                break;

            height++;
            used = used + (usedCubes + height);
            usedCubes += height;
            if((cubes - used) >= 0)
                result++;
        }
        System.out.println(result);
        s.close();
    }
}


