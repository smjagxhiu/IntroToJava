package ch03_TypeDouble;

import java.util.*;
public class SyprinaERrethit {
 public static void main(String[] args) {
   final double PI = 3.14;
   double r,s;	
   Scanner in = new Scanner(System.in);
   System.out.print("Rrezja e rrethit: ");
   r = in.nextDouble();
   s = PI * r * r;
   System.out.println("Syprina e rrethit eshte "+ s);

 }

}