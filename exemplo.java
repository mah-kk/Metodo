import java.util.Scanner;

public class exemplo {

    public static void main(String[] args) {
        menuCalculadora();
    }

    public static void menuCalculadora() {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("Digite o primeiro número:");
            double numero1 = scanner.nextDouble();

            System.out.println("Digite o segundo número:");
            double numero2 = scanner.nextDouble();

            System.out.println("\nCalculadora - Escolha a operação:");
            System.out.println("soma\nsubtracao\nmultiplicacao\ndivisao\nresto");

            String operacao = scanner.next();

            if (operacao.equalsIgnoreCase("soma")) {
                soma(numero1, numero2);
            } else if (operacao.equalsIgnoreCase("subtracao")) {
                subtracao(numero1, numero2);
            } else if (operacao.equalsIgnoreCase("multiplicacao")) {
                double resultado = multiplicar(numero1, numero2);
                System.out.println("Multiplicação: " + resultado);
            } else if (operacao.equalsIgnoreCase("divisao")) {
                divisao(numero1, numero2);
            } else if (operacao.equalsIgnoreCase("resto")) {
                restoDaDivisao(numero1, numero2);
            } else {
                System.out.println("Operação inválida!");
            }

            System.out.println("\nDeseja fazer outro cálculo? (sim/nao)");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("sim"));

        System.out.println("Encerrando a calculadora...");
        scanner.close();
    }

    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println("Soma: " + resultado);
    }

    public static void subtracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println("Subtração: " + resultado);
    }

    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static void divisao(double numero1, double numero2) {
        if (numero2 != 0) {
            double resultado = numero1 / numero2;
            System.out.println("Divisão: " + resultado);
        } 
        }
    }

    public static void restoDaDivisao(double numero1, double numero2) {
        if (numero2 != 0) {
            double resto = numero1 % numero2;
            System.out.println("Resto da divisão: " + resto);
        } 
    }
}
