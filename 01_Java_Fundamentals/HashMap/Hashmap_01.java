import java.util.HashMap;
public class Hashmap_01 {
    public static void main(String args[])
    {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Mango");

        System.out.println(map);

        System.out.println(map.get(1));

        map.put(2,"Orange");

        map.remove(3);

        System.out.println(map);

        System.out.println("Contains index 3? -"+map.containsKey(3));

        if(map.containsKey(1))
        {
            System.out.println(map.get(1)+" exists");
        }
    }
    
}
