import java.util.HashMap;
import java.util.Scanner;
    public class WordsSpaces_9{

        public static void main(String...s)
            {  Scanner sc = new Scanner(System.in);
                HashMap<Character,Integer> map = new HashMap<Character,Integer>();
                System.out.println("Enter a String :");
                String str = sc.nextLine();
                int word=1;
                for(int i=0;i<str.length();++i)
                {
                    if(str.charAt(i)==' ')
                        word++;
                }

                System.out.println("Number of words="+word);
                System.out.println("Number of spaces="+(word-1));
            }
        }
