import java.util.Arrays;
public class Array_07 {
    
    public static int removeDuplicates(int[] nums) {

        int read = 1;
        int write = 0;

        while(read < nums.length)
        {
            if(nums[read] == nums[read-1])
            {
                read++;
            }else{
                write++;
                nums[write] = nums[read];
                read++;
            }
        }
        return write+1;
        
    }

    public static void main(String args[])
    {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k =removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("No. of unique elements are "+k);
    }
}
