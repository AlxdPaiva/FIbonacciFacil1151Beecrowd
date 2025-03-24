/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonaccifacil1151beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class FIbonacciFacil1151Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int N = teclado.nextInt();
        int primeiro = 0;
        int segundo = 1;
        
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                System.out.print(primeiro);
            } else if (i == 1) {
                System.out.print(" " + segundo);
            } else {
                int prox = primeiro + segundo;
                System.out.print(" " + prox);
                primeiro = segundo;
                segundo = prox;
            }
        }
        System.out.println("");
    }
    
}
