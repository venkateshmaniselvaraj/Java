import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Common Objects Declaration
        Scanner scanner = new Scanner(System.in);


        //Inform the user
        System.out.println("Area Calculator");
        System.out.println("Please select the choice");
        System.out.println("1.Circle");
        System.out.println("2.Square");
        System.out.println("3.Rectangle");
        System.out.println("4.Ellipse");

        //Input
        int usersChoice = scanner.nextInt();

        if(usersChoice == 1)
        {
            //Inform the User
            System.out.println("Please enter the radius of the circle");

            //Input
            float radiusOfCircle = scanner.nextFloat();

            //Process
            Circle c = new CircleBuilder().setRadius(radiusOfCircle).createCircle();

            //Output
            System.out.println(c.CalculateArea());
        }
        else if(usersChoice == 2)
        {
            //Inform the User
            System.out.println("Please enter the side length of the square");

            //Input
            int lengthOfASide = scanner.nextInt();

            //Process
            float areaOfSquare = lengthOfASide * lengthOfASide;

            //Output
            System.out.println(areaOfSquare);
        }

    }
}

