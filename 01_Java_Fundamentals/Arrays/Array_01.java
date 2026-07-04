/* Print the whole array.
Print the first element.
Print the last element.
Print the length.
Change 21 to 100.
Print the array again.*/
import java.util.Arrays;

class Array_01
{

public static void main(String args[])
{
 
    int[] number = {15,8,21,4,19};

 System.out.println(Arrays.toString(number));

 System.out.println(number[0]);

 System.out.println(number[number.length -1]);

 System.out.println(number.length);

 for(int n =0; n< number.length ; n++)
 {
    if(number[n]==21)
    {
        number[n]=100;
    }
 }

 System.out.println(Arrays.toString(number));

}
}