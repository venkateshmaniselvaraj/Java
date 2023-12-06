public class Session9 {

    public static void main(String[] args)
    {
        String str = " Hello World !";
        String name = "Ms.Rahul";


        String strLowerCase = str.toLowerCase();
        String strUpperCase = str.toUpperCase();
        String strTrimmed = str.strip();
        String strLeadTrimmed = str.stripLeading();
        String strTrailingTrimmed = str.stripTrailing();

        System.out.println("Input String Length :" + str.length());
        System.out.println("Small Letters (Lower Case) :" + strLowerCase);
        System.out.println("Capital Letters (Upper Case) :" + strUpperCase);
        System.out.println("Trimmed at Both Ends :" + strTrimmed);
        System.out.println("Trimmer at Start(Leading Space) :" + strLeadTrimmed);
        System.out.println("Trimmer at End(Trailing Space) :" + strTrailingTrimmed);
        System.out.println("Index of !:" + str.indexOf('@'));
        System.out.println("Character at :" + str.charAt(13));
        System.out.println("Replace ! with Space : " + str.replace('!', ' '));
        System.out.println("Replace ! with % : " + str.replace('!', '%'));
        System.out.println("Concat string with Concat Method :" + str.concat(name));
        System.out.println("Concat string with + :" + str + name);
        System.out.println("Name : " + name);
        System.out.println("Extract name using SubString begin index :" + name.substring(3));
        System.out.println("Extract name using begin and end index :" + name.substring(3, 5));
        System.out.println("Input String :" + str); ///Strings are Immutable

        //Email: Address
        //vmselvaraj@outlook.com
    }
}
