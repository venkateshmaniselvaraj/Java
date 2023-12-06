import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your last name");
        String lastName = scanner.nextLine();

        System.out.println("Please enter your City");
        String city = scanner.nextLine();

        //Primitive Data Types
        boolean m = true;  //1 bit
        boolean n = false;

        byte q = 8; //8 bit (1 Byte)
        byte qn = -100;

        char o = 'a'; //16 bit (2 Bytes)

        short r = 32767; //16 bit (2 Bytes)
        short nr = -100;

        int i = 10;   //32 bit (4 bytes) Natural Number
        int j = 20;
        int ni = -10;
        int k = i - j;

        long a = 10; //64 bits (8 bytes) Natural numbers
        long b = 10;
        long an = -100;
        long c = a + b;

        float d = 10.23f; //32 bits (4 bytes)  -  6  to 7 floating digits
        float e = 20.34f;
        float en = -100.23f;
        float f = d + e;

        double g = 100.00d; //64 bits (4 bytes) - floating 15 digits
        double h = 23.456d;
        double hn = - 2345.67890d;
        double l = g + h;


        String p = "Hello World!"; //Any length

    }
}