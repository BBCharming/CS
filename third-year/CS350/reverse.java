import java.util.Scanner;

public class reverse
{
   public static String Reverse(String word)
   {
      int position = word.length();
      String reversedWord = "";
      for ( int i = position-1; i >= 0; i--)
         reversedWord = reversedWord + word.charAt(i);
      return reversedWord; 
   };
   public static void main(String[] arg)
   {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter a word or pharse: ");
     String userInput= input.nextLine();
     System.out.println("Reveresed word: "+Reverse(userInput)); 
   }

}
