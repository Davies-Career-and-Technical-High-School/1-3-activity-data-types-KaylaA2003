import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Hello, what is your name?");
      String name = scan.nextLine();
      System.out.print("Hi " + name + "! How old are you? ");
      int age = scan.nextInt();
      System.out.print(name + " is " + age + " years old!" );
    }
}