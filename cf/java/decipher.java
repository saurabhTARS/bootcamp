import java.util.Scanner;

public class decipher
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine()), i = 0, it = 0;
        String letters = s.nextLine();
        String result = "";

        while(i < n)
        {
            // System.out.println(letters.charAt(i));
            result += letters.charAt(i);
            it++;
            i += it;
        }

        System.out.println(result);
        s.close();
    }
}