import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("***********************************************");
        System.out.println("EJERCICIO 1 - CALCULADORA");
        System.out.println("***********************************************");

        for (double i = 0; i < 5; i++) {
            Calculadora calculador = new Calculadora();
            calculador.ingresarValores();
            double resultado = calculador.getResultado();
            System.out.println("-> Resultado: " + resultado);

            if (resultado < 0) {
                System.out.println("Tené cuidado, el resultado es negativo!");
            } else if (resultado >= 0 && resultado < 10000) {
                System.out.println("Resultado dentro de los límites");
            } else {
                System.out.println("Error, resultado muy grande");
            }

            System.out.println("------------------------------");
        }

        System.out.println("***********************************************");
        System.out.println("EJERCICIO 2 - DIVISION POR CERO");
        System.out.println("***********************************************");

        System.out.println("Realicé la validación de división por cero en el ejercicio 1 dentro del método " +
                "'calcular()' de la clase Calculadora, con un If dentro del caso de división del switch. " +
                "Sin embargo como coloque el tipo de dato double me coloca también 'Error, resultado muy grande'. " +
                "Entiendo que hace referencia a que tiende a infinito por los decimales, con Int no es igual. " +
                "Al dividir por cero aparece una excepcion y crashea." +
                "Ejemplo sin usar la class Calculadora para verificar tipo de datos entero. Adjunto captura de excecpion" +
                "Agrego un mensaje para la excepcion aritmética del tipo de dato int"
        );
        int a = 10;
        int b = 0;
        int resultado = 0; // <- se declara acá
        System.out.println("Probando división entera: " + a + " / " + b);
        try {
            resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero (int).");
        }

        System.out.println("------------------------------");
        System.out.println("***********************************************");
        System.out.println("EJERCICIO 3 - PERSONAJES DE JUEGO");
        System.out.println("***********************************************");

        Espadachin espadachin1 = new Espadachin(1000, 35);
        Torre torre1 = new Torre(220, 4);
        Mago mago1 = new Mago(85, "Fuego");

        List<Personaje> personajes = new ArrayList<>();
        personajes.add(espadachin1);
        personajes.add(torre1);
        personajes.add(mago1);

        System.out.println("Estados antes de entrenar:");
        mostrarEstados(personajes);
        System.out.println("------------------------------");

        System.out.println("Entrenando personajes...");
        for (Personaje p : personajes) {
            p.entrenar();
        }
        System.out.println("------------------------------");
        System.out.println("Estados después de entrenar:");
        mostrarEstados(personajes);
    }
    private static void mostrarEstados(List<Personaje> personajes) {
        for (Personaje p : personajes) {
            p.mostrarEstado();
        }
    }
}
