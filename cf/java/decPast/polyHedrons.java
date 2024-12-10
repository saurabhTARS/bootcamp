package decPast;
import java.util.*;

public class polyHedrons
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        int n = Integer.parseInt(myObj.nextLine());
        int result = 0;

        while(n > 0)
        {
            String poly = myObj.nextLine();
            if(poly.contains("Tetra"))
                result += 4;
            else if(poly.contains("Cube"))
                result += 6;
            else if(poly.contains("Octa"))
                result += 8;
            else if(poly.contains("Dode"))
                result += 12;
            else if(poly.contains("Ico"))
                result += 20;
            n--;
        }
        
        System.out.println(result);
        myObj.close();
    }
}