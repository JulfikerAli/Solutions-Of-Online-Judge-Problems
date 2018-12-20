package uribeginners;
import java.util.Scanner;
public class Average1 {
    public static void main(String[] args) {


	float A,B,X;
      Scanner sum = new Scanner(System.in);
      
      A=sum.nextFloat();
      B=sum.nextFloat();
      X = (float) (((A * 3.5) + (B * 7.5)) / (3.5 + 7.5));
      String media = String.format("MEDIA = %,.5f", X);
      System.out.print(media +"\n");


   }
    
}
