public class Session11 {
    public static void main(String[] args)
    {
        //Take an input string from user -- Hello
        //Take another input which is a character -l
        //Print the number of occurrences of that character in the string -2

        String inputString = "Hello";
        int count = 0;

        for(int t = 0; t < inputString.length(); t++)
        {
           if(inputString.charAt(t) == 'l')
               count = count + 1;
        }

        System.out.println(count);
    }
}
