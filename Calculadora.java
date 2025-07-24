import java.util.Scanner;

public class Calculadora {
    private double numero1;
    private double numero2;
    private String operador;
    private Scanner scanner = new Scanner(System.in);

    public void ingresarValores() {
        this.numero1 = leerNumero("-> Primer valor: ");
        this.numero2 = leerNumero("-> Segundo valor: ");
        this.operador = leerOperacion("-> Operación: ");
    }

    private double leerNumero(String mensaje) {
        double numero = 0;
        boolean numerovalido = false;

        while (!numerovalido) {
            System.out.print(mensaje);
            if (scanner.hasNextDouble()) {
             numero = scanner.nextDouble();
                numerovalido = true;
            } else {
                System.out.println("Error: No has ingresado un numero.");
                scanner.next();
            }
        }
        return numero;
    }


    private String leerOperacion(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String operador = scanner.next();
            if (operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/")) {
                return operador;
            } else {
                System.out.println("Operación no válida. Usá +, -, * o /");
            }
        }
    }

    public double calcular() {
        switch (operador) {
            case "+": return numero1 + numero2;
            case "-": return numero1 - numero2;
            case "*": return numero1 * numero2;
            case "/":
                if (numero2 == 0) {
                    System.out.println("Error: No se puede dividir por cero. El resultado no es un número válido (NaN) o es infinitamente grande (tiende a infinito).");
                    return Double.NaN;
                }
                return numero1 / numero2;
            default:
                System.out.println("Operación no valida.");
                return 0;
        }
    }

    public double getResultado() {
        return calcular();
    }
}
