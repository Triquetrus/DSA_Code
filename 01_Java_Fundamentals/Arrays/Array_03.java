import java.util.*;

public class Array_03
{
    public static void main(String args[])
    {
        int[] numbers = {15,8,21,4,19,8,8};
        int counter = 0;
        int even = 0;
        int odd = 0;
        int largest = numbers[0];
        int smallest = numbers[0];

        for(int i : numbers)
        {
            if(i == 8)
            {
              counter++;
            }

            if(i%2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }

            if(i>largest)
            {
                largest = i;
            }

            if(i<smallest)
            {
                smallest = i;
            }

        }

        System.out.println("8 appears " + counter +" times");
        System.out.println("Even no: "+even+" & Odd no: "+odd);
        System.out.println("Largest no: "+largest+" & Smallest no: "+smallest);

        for(int i =0;i<numbers.length; i++)
        {
            if(numbers[i]%2 == 0)
            {
                numbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}