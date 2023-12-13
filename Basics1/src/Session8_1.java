import java.util.Scanner;

public class Session8_1 {
    public static void main(String[] args)
    {
        //Get a natural number from user //Ex: 5
        //Print
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5

        //1- Factorial !

        //take an input from user.  //6


        // get an input number of rows : 6 - 1 for loop
        // *
        // *
        // *
        // *
        // *
        // *

        // get an input number of rows : 5  - two for loops nested
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *

        //Print
        //1 2 3 4 5 6     - * * * * * *
        //1 2 3 4 5       - * * * * *
        //1 2 3 4
        //1 2 3
        //1 2
        //1


        System.out.println("Enter a number to print a number triangle :");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();  //5

        for(int i= 1; i <= input; i++)    //i = 4; 4 <= 5 (true)
        {
            for(int j = 1; j <= i; j++)  //j = 5; 5 <= 4 (false)
            {
                System.out.print(j + " ");  //1 2 3 4
            }

            System.out.println(); //new line
        }


    }
}
