package _2024_12_09;


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

        i = 1;
        String input2 = myObj.nextLine();
        String[] in2 = input2.split("\\s");
        TreeMap<Integer, ArrayList<Integer>> treeMap = new TreeMap<Integer, ArrayList<Integer>>();

        for(String word : in2)
        {   
            Integer key = Integer.parseInt(word);
            if(treeMap.containsKey(key))
            {
                ArrayList<Integer> nums = treeMap.get(key);
                nums.add(i++);
                treeMap.put(key, nums);
            }
            else 
            {
                ArrayList<Integer> nums = new ArrayList<>();
                nums.add(i++);
                treeMap.put(key, nums);
            }
            
        }

        // for(int key : treeMap.keySet())
        // {
        //     System.out.println("Key : " + key + ", Value : " + treeMap.get(key));
        // }

        
        int result = 0, count = 0;
        ArrayList<Integer> rList = new ArrayList<Integer>();

        while(!treeMap.isEmpty())
        {   
            int key = treeMap.firstKey(); 
            ArrayList<Integer> val = treeMap.get(key);
            if(result + key <= firstLine[1])
            {
                result += key;
                rList.add(val.getFirst());
                val.removeFirst();
                count++;
                // System.out.println("Removed key : " + val.isEmpty());
                if(val.isEmpty())
                {
                    // System.out.println("Removed key : " + treeMap.get(key));
                    treeMap.remove(key);
                    // System.out.println("Removed key");
                }
            }
            else 
                break;
        }

        if(count == 0)
            System.out.println(count);
        else
        {
            System.out.println(count);
            System.out.println(rList.toString().replace(",", "").replace("[", "").replace("]", ""));
        }
        myObj.close();
    }
}
