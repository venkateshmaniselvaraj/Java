import java.util.Scanner;

public class Session8 {
    public static void main(String[] args)
    {
        //Sum of natural numbers
        //Case 1: Input 100: 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 +10....100

        System.out.println("Enter a number to calculate sum of natural numbers :");
        Scanner scanner = new Scanner(System.in);
        int input  = scanner.nextInt(); //3
        int output = 0;  //1 + 2 + 3 = 6

        //output = (input * (input + 1)) / 2;

        for(int i = 1;i <= input; i++)  // i = 4, 4 <= 3 (false)
        {
            output = output + i;       //output = 3 + 3 //output = 6
        }

        System.out.println("Sum of natural number for input " + input);
        System.out.println(output);

    }
}
