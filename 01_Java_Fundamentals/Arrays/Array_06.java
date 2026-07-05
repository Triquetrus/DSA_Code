import java.util.Arrays;
public class Array_06 {

    static int[] numbers = {10,20,30,40,50,60};

    public static int[] swap(int left, int rigth)
    {
        while(left< rigth)
        {
            int temp = numbers[left];
            numbers[left] = numbers[rigth];
            numbers[rigth] = temp;
            left++;
            rigth--;
        }
        return numbers;
    }
    
    public static void main(String args[])
    {
        int left= 0;
        int rigth = numbers.length/2-1;
        swap(left, rigth);
        System.out.println(Arrays.toString(numbers));
    }
}
