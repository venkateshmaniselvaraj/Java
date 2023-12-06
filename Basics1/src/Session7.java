public class Session7 {

    public static void main(String[] args)
    {
        //Loops for -loop, while - loop and do-while loop, for-each


        //Print even number from 1 to n

        /**
        for(int a = 1;a <= 100;a++)
        {
            int reminder_balance = a % 2;

            if(reminder_balance == 0)
                System.out.println("Even Number: " + a);
            else
                System.out.println("Odd Number:" + a);
        } */


        /**
        int a = 1;

        while (a <= 100)
        {
            int reminder_balance = a % 2;

            if(reminder_balance == 0)
                System.out.println("Even Number: " + a);
            else
                System.out.println("Odd Number:" + a);

            a++;
        }**/

        int a = 1;

        do
        {
            int reminder_balance = a % 2;

            if(reminder_balance == 0)
                System.out.println("Even Number: " + a);
            else
                System.out.println("Odd Number:" + a);

            a++;
        }while(a <= 100);
    }
}
