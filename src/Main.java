import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        //Declare Variables
        Scanner in = new Scanner(System.in);
        double length = 0;
        double height = 0;
        String trash;

        System.out.print("Enter the length of the rectangle: ");
        //Get input
        if (in.hasNextDouble()) {
            // OK safe to read in a double
            length = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
        } else {
            // Not a double can’t use nextDouble() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("You said your length was: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);
        }

        System.out.print("Enter the height of the rectangle: ");
        if (in.hasNextDouble()) {
            // OK safe to read in a double
            height = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
        } else {
            // Not a double can’t use nextDouble() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("You said your height was: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);

        }

        //Declare new Variables and Output
        double area = length * height;

        double cSquare = (length * length) + (height * height);

        double c = Math.sqrt(cSquare);

        System.out.println("The area of your rectangle is: " + area);

        System.out.println("The diagonal of your rectangle is: " + c);
    }
}