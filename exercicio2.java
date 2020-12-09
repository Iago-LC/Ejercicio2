package boletín.pkg2;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
        int n;
        int blanco;
        int num = 0;
        int fig = 1;
        Scanner sc = new Scanner(System.in);

	System.out.println("Introduzca un número entre 3 e 10:");
        n = sc.nextInt();
        System.out.println("");

	}
        blanco = (n * 2) - 2;
        while (num < n) {
            for (int i = 0; i < fig; i++) {
                System.out.print("*");
            }

for (int i = 0; i < blanco; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < fig; i++) {
                System.out.print("*");
            }
            System.out.println("");
            blanco = blanco - 2;
            fig++;

            num++;
        }

        System.out.println("");
    }

}		
		
	        
		     
