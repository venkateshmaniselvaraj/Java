import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Session12 {
    public static void main(String[] args) throws FileNotFoundException {
        //H:\Software Classes\Data\SampleFile1.txt
        //  \\ Escape character
        // a,e,i,o,u


        //Find out number of words:

        File f = new File("H:\\Software Classes\\Data\\SampleFile1.txt");
        Scanner scanner = new Scanner(f);
        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            line = line.toLowerCase();

            int vowelCount = 0;

            for(int index = 0; index < line.length(); index++)
            {
                if(line.charAt(index) == 'a' ||
                   line.charAt(index) == 'e' ||
                   line.charAt(index) == 'i' ||
                   line.charAt(index) == 'o' ||
                   line.charAt(index) == 'u')
                {
                    vowelCount = vowelCount + 1;
                }
            }

            System.out.println(line + " Vowel Count : " + vowelCount);
        }
    }
}
