import java.util.Scanner;

public class Program_17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int input = s.nextInt();
        String bin = Integer.toBinaryString(input);
        System.out.println(bin);
    }
}