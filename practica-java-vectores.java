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
        
        for(int i = 0; i < nombres.length; i++){
            System.out.print("Ingrese el nombre " + (i + 1)
                + ": ");
            nombres[i] = scanner.nextLine();
        }
        
        String[] apellidos = new String[tamano];
        
        for(int i = 0; i < nombres.length; i++) {
            System.out.print("\nIngrese el apellido " + (i + 1) + ": ");
            apellidos[i] = scanner.nextLine();
        }
        
        
        System.out.println("\nNombres ingresados");
        
        for(int i = 0; i < nombres.length; i++){
            System.out.println("nombre " + (i + 1) + ": " +
                nombres[i] + " " + apellidos[i]);
        }
    }
}