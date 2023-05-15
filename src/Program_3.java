public class Program_3 {
    int a = 10;////declaring instance variable
    static int b = 20;// declaring static value

    public static void testvariable() {
        System.out.println(b);// declaring static method.

    }

    public void variable() {

        System.out.println(a);// declaring instance method.
    }

    //declaring main method
    public static void main(String[] args) {
        testvariable();// calling static method
        Program_3 cal = new Program_3();   // creating object
        cal.variable(); // calling instanc method


    }
}
