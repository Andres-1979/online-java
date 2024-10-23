// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de estudiantes del grupo de sistemas: ");
        int tamano = scanner.nextInt();
        scanner.nextLine();
        
        String[] nombres = new String[tamano];
        String[] apellidos = new String[tamano];
        double[][] notas = new double[tamano][3];
        
        for(int i = 0; i < nombres.length; i++){
            System.out.print("Ingrese el nombre del esrudiante " + (i + 1)
                + ": ");
            nombres[i] = scanner.nextLine();
        }
        
        System.out.print("\n");
        
        for(int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el apellido del estudiante " + (i + 1) + ": ");
            apellidos[i] = scanner.nextLine();
        }
        
        for(int i = 0; i < nombres.length; i++) {
            for(int j = 0; j < notas[i].length; j++) {
                System.out.print("\nIngrese las notas " + (j + 1) + ": ");
                 notas[i][j]= scanner.nextInt();
            }
        }
        
        System.out.println("\nNombres ingresados");
        System.out.println(" ");
        double notaDefinitiva;
        
        for(int i = 0; i < nombres.length; i++){
            notaDefinitiva = 0;
            System.out.println("Estudiante " + (i + 1) + ": " + nombres[i] + (" ") + apellidos[i]);
            for(int j = 0; j < notas[i].length; j++) {
                System.out.println("Sus notas son:  " + notas[i][j]);
                notaDefinitiva = notaDefinitiva + notas[i][j];
            }
            notaDefinitiva = notaDefinitiva/3;
            System.out.println("Nota definitiva  " + notaDefinitiva);
            
        }
    }
}