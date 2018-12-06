import java.util.Scanner;
public class SumOfFirstLast_13 {

    public static void main(String args[]) {

        int r, n, rev = 0, fd, ld, s;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        n = sc.nextInt();

        ld = n % 10;

        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        fd = rev % 10;
        s = fd + ld;

        System.out.println("\nThe Sum of First and Last Digit is :" + s);


    }
}