/*
 * This Code Has Been
*Created By
*Julfiker Ali
*of CSE Department
*of University of Rajshahi
 */
package uribeginners;

import java.util.Scanner;

/**
 *
 * @author Julfiker
 */
public class FuelSpent {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {

  double a, b, r;

  Scanner sc = new Scanner(System.in);
  a = sc.nextDouble();
  b = sc.nextDouble();

  r = (a * b)/12;
  
  System.out.printf("%.3f\n", r);
  

 }

}