/*#LEETCODE-1: TWO SUM -
Given an integer array and a target value, 
find the indices of the two numbers that add up to the target.*/
import java.util.*;
public class Hashmap_05 {

    public static void main(String args[])
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        for(int i = 0; i< nums.length; i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                System.out.println(i+","+map.get(target-nums[i]));
                break;
            }
            else{
                map.put(nums[i],i);
            }
        }
    }
    
}
