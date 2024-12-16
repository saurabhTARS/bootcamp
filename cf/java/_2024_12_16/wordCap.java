package _2024_12_16;
import java.util.Scanner;

public class wordCap {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();

        String result = "";
        Character c = word.toCharArray()[0];

        if(Character.isLowerCase(c))
            c = Character.toUpperCase(c);
        result += c.toString();
        result += word.substring(1);
        System.out.println(result);
        s.close();
    }
}
