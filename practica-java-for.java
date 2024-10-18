// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Escribe el # de veces que se repite ");
        int numero = keyboard.nextInt();
        
        for (int  i= 1; i <= numero; i++){
            System.out.println(i);
        }
        
    }
}