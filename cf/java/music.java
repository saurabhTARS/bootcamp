

import java.util.*;

public class music {

    public static void main(String[] args)
    {
        // input 
        Scanner myObj = new Scanner(System.in);
        int[] firstLine = new int[2];
        int i = 0;

        String input1 = myObj.nextLine();
        String[] in1 = input1.split("\\s");

        for(String word : in1)
        {
            firstLine[i++] = Integer.parseInt(word);
        }

        i = 0;
        // int[] secondLine = new int[firstLine[0]];
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();


        String input2 = myObj.nextLine();
        String[] in2 = input2.split("\\s");

        for(String word : in2)
        {
            // secondLine[i++] = Integer.parseInt(word);
            hmap.put(i++, Integer.parseInt(word));
        }



        // Arrays.sort(secondLine);
        ArrayList<Integer> hmapByValue = new ArrayList<>(hmap.entrySet());

        Collections.sort(hmapByKey);


        int result = 0, count = 0;
        i = 0;
        ArrayList<Integer> rList = new ArrayList<Integer>();
        System.out.println(hmapByKey);

        for(Integer val : hmapByKey)
        {
            if(result + val <= firstLine[1])
            {
                // if(!rList.contains(secondLine[i]))
                // {
                    result += val;
                    rList.add(hmap.get(val)+1);
                    count++;
                // }
            }
            else 
                break;

            // i++;
        }

        if(count == 0)
            System.out.println(count);
        else
        {
            System.out.println(count);
            System.out.println(rList.toString().replace(",", "").replace("[", "").replace("]", ""));
        }

        myObj.close();
        // System.out.println(firstLine[1]);
        // System.out.println(secondLine[1]);
        // replaceAll("[-+.^:,]","")

    }
}
