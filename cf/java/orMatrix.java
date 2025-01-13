
import java.util.Scanner;

public class orMatrix {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String[] words = s.nextLine().split("\\s");
        int m = Integer.parseInt(words[0]);
        int n = Integer.parseInt(words[1]);

        int[][] mat = new int[m][n];

        for(int i = 0; i < m; i++)
        {
            String[] row = s.nextLine().split("\\s");
            for(int j = 0; j < n; j++)
            {
                mat[i][j] = Integer.parseInt(row[j]);
            }
        }

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
               System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }

        s.close();
    }
    
}
