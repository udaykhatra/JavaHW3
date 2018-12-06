import java.util.*;
public class ReverseNumber_12
{
    public static void main (String [] args)
    {
        Scanner n = new Scanner(System.in);
        int num;
        System.out.println("Please enter the number");
        num = n.nextInt();
        int temp = 0;
        int reverse = 0;
        String str = "";
        System.out.println("The number before getting reversed " + num);
        while (num != 0)
        {
            temp = num % 10;
            reverse = reverse*10 + temp;
            num = num/10;
            str = Integer.toString(reverse);
        }
         System.out.println("The reversed number is " + str);
    }
}