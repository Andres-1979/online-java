// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Escribir un numero: ");
        int numero = keyboard.nextInt();
       
        while (numero >= 0){
            System.out.print("Ingresa un numero ");
            numero = keyboard.nextInt();
           
        }
        // String palabraCambiada = "Hola mundo";
        // if ("Hola".equals(text)){
        //     System.out.println("la palabra es: " + palabraCambiada);
        // }else{
        //     System.out.println("Yo me merezco un 5");
        // }
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Escribir una palabra: ");
        String text = keyboard.nextLine();
        System.out.println("El texto es: " + text);        
       
    }
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numero;
        
        do {
            System.out.println("Escribe un numero");
            numero = keyboard.nextInt();
            if(numero <= 0){
                System.out.println("EL numero es negativo");
            } else {
                System.out.println("EL numero es positivo");
            }
        } while(numero >= 0);
    }
}
