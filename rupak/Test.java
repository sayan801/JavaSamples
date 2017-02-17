import java.util.Scanner;
public class Test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("What is your favorite color? ");
    String name = scanner.next();
    System.out.println("Your favorite color is: " + name);
  }
}