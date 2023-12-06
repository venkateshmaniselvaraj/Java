import java.util.Scanner;

public class Session10 {
    
    public static void main(String[] args)
    {
        //Message to user
        System.out.println("Please enter a date string in dd/mm/yyyy format to split");

        //input
        Scanner scanner = new Scanner(System.in);
        String inputDateString = scanner.nextLine();

        //Find the Outputs
        String date = inputDateString.substring(0, 2);  // Extracts string from position 0 to 1
        String month = inputDateString.substring(3, 5); // Extracts string from position 3 to 4
        String year = inputDateString.substring(6); // Extracts string from position 6 to end of the string


        //Print the Output
        System.out.println("Date : " + date);
        System.out.println("Month : " + month);
        System.out.println("Year : " + year);


    }
}
