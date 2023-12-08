package Dados;
import java.util.Random;
import java.util.Scanner;

public class Dados {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int dado1, dado2;
        int tecla = 0;

        while (tecla != 5) {
            dado1 = random.nextInt(6) + 1; // Genera un número aleatorio entre 1 y 6 para el primer dado
            dado2 = random.nextInt(6) + 1; // Genera un número aleatorio entre 1 y 6 para el segundo dado

            System.out.println("Primer dado: " + dado1);
            System.out.println("Segundo dado: " + dado2);

            System.out.println("Presiona cualquier número para continuar o 5 para salir:");
            tecla = scanner.nextInt();
        }

        System.out.println("Fin del programa.");
    }
}
