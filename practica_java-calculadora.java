import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int a = keyboard.nextInt();


        System.out.print("Ingrese otro numero: ");
        int b = keyboard.nextInt();



        int result = a + b;
        System.out.println("La suma de " + a + " y " + b + " es: " + add(a, b));
        System.out.println("La resta de " + a + " y " + b + " es: " + sub(a, b));
        System.out.println("La multiplicacion de " + a + " y " + b + " es: " + multi(a, b));

    }

    public static int add(int a, int b) {
        int c = a + b;
        return a + b;
    }

    public static int sub(int a, int b) {
        int c = a - b;
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }
}