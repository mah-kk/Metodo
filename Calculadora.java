import java.util.Scanner;
 
public class Calculadora {
 
    public static double subtrair(double n1, double n2){

        return n1 - n2;

    }
 
    public static double multiplicar(double n1, double n2){

        return n1 * n2;

    }
 
    public static double dividir(double n1, double n2){

        return n1 / n2;

    }
 
    public static double restoDaDivisao(double n1, double n2){

        return n1 % n2;

    }
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
 
        while (continuar){

            System.out.println("Digite o primeiro numero: ");

            double num1 = scanner.nextDouble();
 
            System.out.println("Digite o segundo numero: ");

            double num2 = scanner.nextDouble();
 
            System.out.println("Escolha a operacao:");

            System.out.println("1 - Somar");

            System.out.println("2 - Subtrair");

            System.out.println("3 - Multiplicar");

            System.out.println("4 - Dividir");

            System.out.println("5 - Resto da Divisao");

            int opcao = scanner.nextInt();
 
            switch (opcao) {

                case 1:

                    System.out.println("Resultado: " + (num1 + num2));

                    break;

                case 2:

                    System.out.println("Resultado: " + subtrair(num1, num2));

                    break;

                case 3:

                    System.out.println("Resultado: " + multiplicar(num1, num2));

                    break;

                case 4:

                    System.out.println("Resultado: " + dividir(num1, num2));

                    break;

                case 5:

                    System.out.println("Resultado: " + restoDaDivisao(num1, num2));

                    break;

                default:

                    System.out.println("Opção inválida.");

            }
 
            System.out.println("Deseja continuar? (s/n)");

            String resposta = scanner.next();
 
            if (!resposta.equalsIgnoreCase("s")) {

                continuar = false;

            }

        }
 
        scanner.close();

    }

}

 