package _2024_12_16;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class helpMaths {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String result = "";
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;

        for(Character c : input.toCharArray())
        {
            if(c != '+')
                list.add(Character.getNumericValue(c));
        }
        Collections.sort(list);

        for(Character c : input.toCharArray())
        {
            if(c == '+')
                result += c;
            else
                result += list.get(i++).toString();
        }
        System.out.println(result);

        s.close();
    }
}
