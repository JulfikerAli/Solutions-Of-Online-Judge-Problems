package uribeginners;
import java.util.Scanner;
public class AreaOfACircle {
 public static void main(String[] args) {

     double A, R;
      Scanner area = new Scanner(System.in);
      R = area.nextDouble();
      A = 3.14159 * R * R;
      System.out.printf("A=%.4f\n", A);

   }

}