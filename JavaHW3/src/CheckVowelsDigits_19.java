import java.util.Scanner;

  public class CheckVowelsDigits_19 {
      public static void main(String[] args) {
          String inputStr;
          double v = 0;
          double n = 0;
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter your string : ");
          inputStr = scanner.nextLine();
          for (int i = 0; i < inputStr.length(); i++) {
              Character c = inputStr.charAt(i);
              if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c ==
                      'o' || c == 'u') {
                  v++;
              } else if (Character.isDigit(c)) {
                  n++;
              }
          }
          System.out.println("No of vowels " + v);
          System.out.println("No of numbers " + n);
      }
  }

