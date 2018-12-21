package uribeginners;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
	
    double R,x;

    Scanner sc = new Scanner(System.in);
 
    R=sc.nextDouble();
    
    x=(4.0/3)*3.14159*R*R*R;
    System.out.printf("VOLUME = %.3f",x);
    System.out.printf("\n");

 }
    
}
