package _2024_12_16;
import java.util.HashSet;
import java.util.Scanner;

public class boyGirl {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        HashSet<Character> hset = new HashSet<>();

        for(Character c : word.toCharArray())
        {
            hset.add(c);
        }

        if(hset.size() % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else 
            System.out.println("IGNORE HIM!");
        
        s.close();
    }    
}
