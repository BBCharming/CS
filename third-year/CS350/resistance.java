import java.util.Scanner;

class resistance
{
   public static void main(String[] argv)
   {
      Scanner input = new Scanner(System.in);
      String userName = "",
             userPassword = "";
      boolean status = true;
      int counter = 3;
      public static void login()
      {
         System.out.print("Enter User Name: ");
         userName = input.NextString;
         System.out.print("Enter Password: ");
         userPassword = input.NextString;
      };

      login();
      while (status)
      {
        if(counter <=0)
         status = false;
        else if (userName != "Benjamin" && userPassword != "Charming")
        {
         System.out.println("Invalid User Name or Password!\n You have"+ counter + " attempts remaining before the system Locks");
         login();
        }
       else
       {
          System.out.println("Welcome To Java Benjamin!\nCharming to see you!");
          status = false;
          counter = 3;
       }
       counter--;
      }
   }
}
