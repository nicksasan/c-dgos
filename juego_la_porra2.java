package juego_la_porra2;
import java.util.*;

public class juego_la_porra2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limite = obtenerNumero(scanner, "Ingrese el límite de números: ");
        int numJugadores = obtenerNumero(scanner, "Ingrese el número de jugadores: ");

        int[][] matrizOrden = inicializarMatrizOrden(numJugadores, limite);
        Set<Integer> numerosRepetidos = new HashSet<>();
        
        int turno = 0;

        while (turno < numJugadores * limite) {
            int jugadorActual = turno % numJugadores;
            int numeroActual = matrizOrden[jugadorActual][turno / numJugadores];

            System.out.println("Turno del Jugador " + (jugadorActual + 1) + ": " + numeroActual);

            int numeroPensado = obtenerNumero(scanner, "Ingrese su número pensado: ");

            if (numerosRepetidos.contains(numeroPensado) || numeroPensado != numeroActual) {
                System.out.println("¡Número repetido o incorrecto! Intente de nuevo.");
            } else {
                numerosRepetidos.add(numeroPensado);
                turno++;
            }
        }

        int jugadorPerdedor = (turno - 1) % numJugadores + 1;
        System.out.println("¡Juego terminado! El jugador " + jugadorPerdedor + " pierde.");
    }

    private static int obtenerNumero(Scanner scanner, String mensaje) {
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print(mensaje);
                numero = Integer.parseInt(scanner.nextLine());
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }

        return numero;
    }

    private static int[][] inicializarMatrizOrden(int numJugadores, int limite) {
        int[][] matrizOrden = new int[numJugadores][limite];

        for (int i = 0; i < numJugadores; i++) {
            for (int j = 0; j < limite; j++) {
                matrizOrden[i][j] = j + 1;
            }
            shuffleArray(matrizOrden[i]);
        }

        return matrizOrden;
    }

    private static void shuffleArray(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            // Swap
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
