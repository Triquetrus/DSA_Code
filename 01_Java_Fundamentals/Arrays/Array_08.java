import java.util.Arrays;
public class Array_08 {

    static int[] nums = {0,2,1,5,3,4};
    public static void main(String args[])
    {
        int[]  ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++)
        {
            ans[i] = nums[nums[i]];
        }

        System.out.println(Arrays.toString(ans));
    }
    
}
