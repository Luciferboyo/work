package demoException.src.exercise;

public class ArithmeticExceptionDemo {
  public static void main(String[] args) {
    try {
      int a = 30,b = 0;
      int c = a/b;//cannot divide by zero
      System.out.println("Result = "+c);
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("Can't divide a number by 0");
    }
  }
}//Output:Can't divide a number by 0
