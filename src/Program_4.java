public class Program_4 {
    int a = 5;// declare 1st instance method
    int b =10; //declare 2nd instance method
    public static int e = 15;// declare 1st Static method
    public static int d = 20;//declare 2nd Static method
      public void pure() {
          System.out.println(a);// declare  instance method
          System.out.println(b);
      }
          public static void println(){
              System.out.println(e);//declare  static method
              System.out.println(d);
          }
      public static void main(String [] args){// declare main method
          println(); // call both static  method
          Program_4 cal = new Program_4();// call instancemethod


    }

    }

