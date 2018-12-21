package uribeginners;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

	int a,b;

    float c;

    Scanner sum =new Scanner(System.in);

    a = sum.nextInt();

    b = sum.nextInt();

    c = sum.nextFloat();

    System.out.printf("NUMBER = %d\n", a);

    System.out.printf("SALARY = U$ %.2f\n", b * c);

 }
    
}
