package ima2;

import java.util.Scanner;

public class IMA2 {
    public static void main(String[] args) {
         int n, c, d, swap;
    Scanner in = new Scanner(System.in);
 
    System.out.println("Masukkan jumlah angka yang akan di urutkan");
    n = in.nextInt();
 
    int array[] = new int[n];
 
    System.out.println("mengurutkan " + n + " bilangan");
 
    for (c = 0; c < n; c++) 
      array[c] = in.nextInt();
 
    for (c = 0; c < ( n - 1 ); c++) {
      for (d = 0; d < n - c - 1; d++) {
        if (array[d] > array[d+1]) /* For descending order use < */
        {
          swap       = array[d];
          array[d]   = array[d+1];
          array[d+1] = swap;
        }
      }
    }
 
    System.out.println("urutan dari terkecil ke besar");
 
    for (c = 0; c < n; c++) 
      System.out.print(" "+array[c]);
    }
    
}
