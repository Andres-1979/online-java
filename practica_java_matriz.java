import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(9) + 2; //Genera un numero entre 2 y 10
        int m = random.nextInt(9) + 2; //Genera un numero entre 2 y 10
        
        System.out.println("La matriz es de "+ n + "X" + m);
        
        int[][] matriz = new int[n][m];
    
        //Llenar la matriz con ceros
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = 0;
            }
        }
        
        System.out.println("Matriz inicial: ");
        for(int[] fila : matriz) {
            for(int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        if ( n == m ) {
            for(int i = 0; i < n; i++) {
                matriz[i][i] = random.nextInt(100);
            }
            
        } else {
            for (int i = 0; i < n && i < m; i++) {
               for (int j = i + 1; j < m; j++) {
                matriz[i][j] = random.nextInt(100);
               }
            }
        }
        
        System.out.println("Matriz despues de la operacion: ");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}