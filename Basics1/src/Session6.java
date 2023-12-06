import java.net.JarURLConnection;
import java.util.Scanner;

public class Session6 {

    public static void main(String[] args)
    {
        //if - else if - else  //Nested If --look at later in detail with a good example
        //switch-case

        //44 - XXL
        //42 - XL
        //40 - L
        //38 - M
        //36 - S
        //34 - XS

        //Regular Expression - Regex

        System.out.println("Please enter the shirt size in cm");
        Scanner s = new Scanner(System.in);
        int shirtSizeInCm = s.nextInt(); //42

        switch (shirtSizeInCm)
        {
            case 44:
                System.out.println("XXL");
                break;
            case 42:
                System.out.println("XL");
                break;
            case 40:
                System.out.println("L");
                break;
            case 38:
                System.out.println("M");
                break;
            case 36:
                System.out.println("S");
                break;
            case 34:
                System.out.println("XS");
                break;
            default:
                System.out.println("Not a valid size");
        }
    }
}
