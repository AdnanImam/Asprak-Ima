
package ima1;

import java.util.Scanner;

public class Ima1 {
    public static void main(String[] args) {
      String original, reverse = "";
      Scanner in = new Scanner(System.in);
 
      System.out.println("INPUT");
      original = in.nextLine();
 
      int kata = original.length();
 
      for ( int i = kata - 1; i >= 0; i-- )
         reverse = reverse + original.charAt(i);
 
      if (original.equals(reverse))
         System.out.println("TRUE");
      else
         System.out.println("FALSE");
 
    }
    
}
