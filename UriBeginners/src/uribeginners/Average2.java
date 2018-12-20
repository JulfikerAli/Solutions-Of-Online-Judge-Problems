package uribeginners;

import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {


	float A,B,C,X;
      Scanner sum = new Scanner(System.in);
      
      A=sum.nextFloat();
      B=sum.nextFloat();
      C=sum.nextFloat();
      X = (float) (((A * 2) + (B * 3)+(C*5)) / (2+3+5));
      String media = String.format("MEDIA = %,.1f", X);
      System.out.print(media +"\n");


   }
    
}
