package _2025_01_13;
import java.util.Scanner;

public class boringApartment {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());

        while(n > 0)
        {   
            int keyPressed = 0;
            String aparNum = s.nextLine();
            int x = Integer.parseInt(aparNum) % 10;

            keyPressed += (x-1)*10;

            if(aparNum.length() == 4)
                keyPressed += 10;
            else if(aparNum.length() == 3)
                keyPressed += 6;
            else if(aparNum.length() == 2)
                keyPressed += 3;
            else if(aparNum.length() == 1)
                keyPressed += 1;
           System.out.println(keyPressed);
            n--;
        }
        s.close();
    }
}
