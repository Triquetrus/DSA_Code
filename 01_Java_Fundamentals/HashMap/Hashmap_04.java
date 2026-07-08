/*Given an array:

int[] numbers = {7, 2, 7, 5, 2, 7, 9};

Write a program that counts how many times each number appears using a HashMap and KeySet() using for each loop. */

import java.util.*;
public class Hashmap_04 {
     public static void main(String args[])
     {
        int[] numbers = {7, 2, 7, 5, 2, 7, 9};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : numbers)
        {
            if(map.containsKey(num))
            {
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        for(int num : map.keySet())
        {
            System.out.println(num+"->"+ map.get(num));
        }
     }
}
