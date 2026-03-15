import java.util.Scanner;

public class lesson3{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Hello There!\n What is your name?\nInput Name: ");
      String name = input.nextLine();
      String[] initials = name.split(" ");
      System.out.print("Hello, ");
      for ( String phrase : initials)
          System.out.print( phrase.charAt(0));
      System.out.print("\n");
   }


}
