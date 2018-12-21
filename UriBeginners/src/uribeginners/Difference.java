package uribeginners;

import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {


	int A,B,C,D,X;
      Scanner sum = new Scanner(System.in);
      
      A=sum.nextInt();
      B=sum.nextInt();
      C=sum.nextInt();
      D=sum.nextInt();
      
      X = ((A *B)-(C*D));
      System.out.print("DIFERENCA = " +X+"\n");


   }
    
}
