/* Sum of all elements
Largest element
Smallest element
Average*/

public class Array_02 {

    


    public static void main(String arge[])
    {


        int[] numbers = {15, 8, 21, 4, 19};
        int sum = 0;
        int largest = numbers[0];
        int smallest = numbers[0];
        
        for(int num : numbers)
        {
            sum += num;
        }

        System.out.println("Sum of Array:"+ sum);

        for(int i = 1; i<numbers.length;i++)
        {   
            if(numbers[i] > largest)
            {
                largest =numbers[i];
            }
        }

        System.out.println("Largest no."+ largest);

        for(int i = 1; i<numbers.length;i++)
        {

            if(numbers[i] < smallest)
            {
                smallest =numbers[i];
            }
        }

        System.out.println("Smallest no."+ smallest);

        System.out.println("Average = " + (sum/numbers.length));

    }
    
}
