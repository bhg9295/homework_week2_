public class Program_5 {
    public static void addition() {
        int a = 10;
        int b = 9;
        int ans = a + b;
        //concatenation
        System.out.println("addition of two number = " + ans);
    }


    public static void subtraction() {
        int a = 10;
        int b = 9;
        int sub = a - b;
        System.out.println("subtraction of two number is =" + sub);
    }

    public void multiplication() {
        int a = 10;
        int b = 9;
        int mul = a * b;
        System.out.println("multiplication of two number is =" + mul);
    }
    public void divison(){
        int a = 10;
        int b = 9;
        int divi = a/b;
        System.out.println("divison of two number is =" + divi);

    }

    public static void main(String[] args) {
       Program_5 cal = new Program_5();
        addition();
        subtraction();
        cal.multiplication();
        cal.divison();
}






}