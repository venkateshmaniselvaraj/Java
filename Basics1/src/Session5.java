import java.util.Scanner;

public class Session5 {

    public static void main(String[] args)
    {
            //90 to  100 - Excellent
            //80 to 89 - First Class
            //60 to 79 - Second Class
            //35 to 59 - Average
            //less than or equal to 35 - Fail

           System.out.println("Please enter the average mark in percentage");

           Scanner scanner = new Scanner(System.in);
           float markPercentage = scanner.nextFloat();


           //And operator &&
           //Or Operator  ||
           //Equal to Operator  ==
           //Not Equal to  !=
           //Less than   <
           //less than or equal to  <=
           //greater than  >
           //greater than or equal to >=

           if (markPercentage < 0 || markPercentage > 100)
           {
               System.out.println("Invalid Mark Input");
           }
           else if (markPercentage >= 90)
           {
               System.out.println("Excellent");
           }
           else if (markPercentage >= 80)
           {
               System.out.println("First Class");
           }
           else if (markPercentage >= 60)
           {
               System.out.println("Second Class");
           }
           else if (markPercentage >= 35)
           {
               System.out.println("Average");
           }
           else if(markPercentage >= 0)
           {
               System.out.println("Fail!,Can do better");

               if(markPercentage != 0)
                   System.out.println("Good, at-least you scored some marks");
               else
                   System.out.println("Zero, Meet the principal");
           }


        if (markPercentage == 100)
        {
            System.out.println("Star");
        }
    }
}
