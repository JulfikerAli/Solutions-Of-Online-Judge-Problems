package uribeginners;

import java.util.Scanner;

public class SimpleCalculate {
    public static void main(String[] args) {
 

    	int n1,n2,code1,code2;

        double A,B,X;

        Scanner sum =new Scanner(System.in);
        
        code1 = sum.nextInt();
        n1 = sum.nextInt();
        A= sum.nextDouble();
      
        code2 = sum.nextInt();
        n2 = sum.nextInt();
        B=sum.nextDouble();
        
        X=((A*n1)+(B*n2));
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", X);

    }
    
}
