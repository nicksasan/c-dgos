Package Dados;
import java.util.Random;
import java.util.Scanner;

public class Dados {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Random random = new Random();

int sumaDados = 0;

while (true) {
    // Tirar dos dados aleatorios
    int dado1 = random.nextInt(11) + 1; // Valores de 2 a 12
    int dado2 = random.nextInt(11) + 1;

    // Reemplazar valores de J, Q, K
    if (dado1 == 10) {
        System.out.println("Dado 1: J");
    } else if (dado1 == 10) {
        System.out.println("Dado 1: Q");
    } else if (dado1 == 10) {
        System.out.println("Dado 1: K");
    } else {
        System.out.println("Dado 1: " + dado1);
    }

    if (dado2 == 10) {
        System.out.println("Dado 2: J");
    } else if (dado2 == 10) {
        System.out.println("Dado 2: Q");
    } else if (dado2 == 10) {
        System.out.println("Dado 2: K");
    } else {
        System.out.println("Dado 2: " + dado2);
    }

    // Calcular la suma de los dados
    sumaDados = dado1 + dado2;
    System.out.println("Suma de los dados: " + sumaDados);

    // Verificar condiciones de victoria, derrota o empate
    if (sumaDados <= 19) {
        System.out.println("¡Ganaste NICOL!");

    } else if (sumaDados > 19) {
        System.out.println("Pierde. Suma de dados es mayor o igual a 20.");

    } else if (sumaDados == 14) {
        System.out.println("Mediogana. Suma de dados es 14.");
    } else if (sumaDados == 2) {
        System.out.println("¡Gana! Suma de dados es 2.");

    } else if ((dado1 == 11 || dado1 == 12 || dado1 == 13) &&
               (dado2 == 11 || dado2 == 12 || dado2 == 13)) {
        System.out.println("¡Gana! Salieron dos letras J, Q, K.");

    } else if ((dado1 == 11 || dado1 == 12 || dado1 == 13) && dado2 == 1 ||
               (dado2 == 11 || dado2 == 12 || dado2 == 13) && dado1 == 1) {
        System.out.println("¡Gana! Letra más 1.");

    }

    // Preguntar al usuario si desea continuar
    System.out.println("Presiona 9 para salir, cualquier otro número para continuar:");
    int opcion = scanner.nextInt();

    if (opcion == 9) {
        break;
    }
}

scanner.close();
System.out.println("Fin del juego.");
