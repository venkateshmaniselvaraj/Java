import java.util.Scanner;

public class Session10_1 {

    public  static void main(String[] args)
    {
        //Find the email domain name
        //@outlook.com  - Domain Name: outlook
        //@gmail.com - Domain Name : gmail
        //@zoho.com - Domain Name : zoho   

        //Sample Inputs
        //vmselvaraj@outlook.com

        System.out.println("Please enter the email id to find the domain name: ");

        //Input
        Scanner scanner = new Scanner(System.in);
        String inputEmailString = scanner.nextLine();

        //Process the input
        int indexOfAtTheRate = inputEmailString.indexOf('@');
        int indexOfDot = inputEmailString.indexOf('.');

        if(indexOfAtTheRate == -1 || indexOfDot == -1)
            System.out.println("Invalid Input");
        else {
            String domainName = inputEmailString.substring(indexOfAtTheRate + 1, indexOfDot);

            //Produce the output
            System.out.println(domainName);
        }


    }
}
