public class Array_04 {

    public static void main(String args[])
    {
        int[] numbers = {15,8,21,4,19,50};
        boolean found =false;

        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i] == 21)
            {
                System.out.println("21 found");
                System.out.println("21 found at index: "+i);
                continue;
            }

            if(numbers[i] == 50)
            {
                found = true;
                break;
            }
        }

        if(found ==  true)
        {
            System.out.println("50 found");
        }else{
            System.out.println("50 not found");
        }
    }
    
}
