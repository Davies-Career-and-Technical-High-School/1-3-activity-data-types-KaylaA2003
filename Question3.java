import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Java is a programming language, true or false?");
      boolean java = scan.nextBoolean();
      System.out.println("Only numbers can be stored by variables in Java, true or false?");
      boolean number = scan.nextBoolean();
      System.out.println("There are only 2 possible values which can be held by a boolean variable, true or false?");
      boolean poolean = scan.nextBoolean();
      System.out.println("Question 1: Your answer: " + java + " Correct answer: true" );
      System.out.println("Question 2: Your answer: " + number + " Correct answer: false" );
      System.out.println("Question 3: Your answer: " + poolean + " Correct answer: true" );
    }
}
       
