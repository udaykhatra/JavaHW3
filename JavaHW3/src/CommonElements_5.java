import java.util.*;
public class CommonElements_5 {
    public static void main(String[] args)
    {
        String[] array1 = {"U", "J", "P", "D","F", "C", "M"};

        String[] array2 = {"M", "S", "Q", "O", "P", "B", "V"};

        System.out.println("Array String: "+Arrays.toString(array1));
        System.out.println("Array String: "+Arrays.toString(array2));

        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i].equals(array2[j]))
                {
                    set.add(array1[i]);
                } } }
        System.out.println("Common element : "+(set));
    }
}