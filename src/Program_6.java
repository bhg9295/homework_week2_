import java.util.Scanner;

public class Program_6 {
    public static void main(String[] args) {
        {

            Scanner io = new Scanner(System.in);
            System.out.println("Input the radius of the circle: ");
            double radius = io.nextDouble();
            System.out.println("Area is = " + (Math.PI  *radius *radius));
        }
    }
}