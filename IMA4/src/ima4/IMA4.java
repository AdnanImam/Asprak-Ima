package ima4;

import java.util.Scanner;

public class IMA4 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int[] input = new int[10];
        for(int j=0;j<10;j++){
            System.out.print("Masukkan angka ke - "+j+" : ");
            input[j] = in.nextInt();
        }
            int current = input[0];
            boolean found = false;

            for (int i = 0; i < input.length; i++) {
                if (current == input[i] && !found) {
                    found = true;
                } else if (current != input[i]) {
                    System.out.print(" " + current);
                    current = input[i];
                    found = false;
                }
            }
            System.out.print(" " + current);
                }
    
}
