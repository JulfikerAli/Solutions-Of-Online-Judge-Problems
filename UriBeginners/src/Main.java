import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	
    double A,B,C;

    Scanner sc = new Scanner(System.in);
 
    A=sc.nextDouble();
    B=sc.nextDouble();
    C=sc.nextDouble();
    double triangle=(A*C)/2;
    double circle=3.14159*C*C;
    double trapezium=((A+B)/2)*C;
    double square =B*B;
    double rectangle=A*B;
    
    System.out.printf("TRIANGULO: %.3f \n", triangle);
    System.out.printf("CIRCULO: %.3f \n", circle);
    System.out.printf("TRAPEZIO: %.3f \n", trapezium);
    System.out.printf("QUADRADO: %.3f \n", square);
    System.out.printf("RETANGULO: %.3f \n", rectangle);
 }
}