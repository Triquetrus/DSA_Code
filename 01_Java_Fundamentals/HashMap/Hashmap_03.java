/* Given:

int[] numbers = {4, 2, 7, 5, 2, 9, 7};

Print the first number that appears twice.*/

import java.util.*;
public class Hashmap_03 {
    public static void main(String args[])
    {
        HashMap<Integer,Boolean> map = new HashMap<>();

        int[] numbers = {4, 2, 7, 5, 2, 9, 7};

        for(int num :numbers)
        {
            if(map.containsKey(num))
            {
                if(map.get(num)==true)
                {
                    System.out.println("First Duplicate: "+ num);
                    break;
                }
            }else{
                map.put(num,true);
            }
        }
    }
}
