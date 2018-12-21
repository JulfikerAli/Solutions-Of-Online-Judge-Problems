package uribeginners;

import java.util.Scanner;

public class SalaryWithBonus {
    public static void main(String[] args) {

    double a,b,x;

    Scanner sc = new Scanner(System.in);
    
    String name = sc.nextLine();


    a = sc.nextDouble();
    b = sc.nextDouble();
    
    x=(a+(b*15)/100);
    System.out.printf("TOTAL = R$ %.2f",x);
    System.out.printf("\n");

 }
    
}
