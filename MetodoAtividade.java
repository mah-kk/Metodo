import java.util.Scanner;
  public class MetodoAtividade{
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo numero:");
        double numero2 = scanner.nextDouble();
       System.out.println("Calculadora\n");
      
      System.out.println("\nCalculadora - Escolha a operaçao:");
      System.out.println("soma\nsubtracao\nmultiplicacao\ndivisao\nresto");
       
       String operacao = scanner.next();
        
        switch (operacao.toLowerCase()) {
            case "soma":
                soma(numero1, numero2);
                break;
            case "subtracao":
                subtracao(numero1, numero2);
                break;
            case "multiplicacao":
                double resultadoMultiplicacao = multiplicar(numero1, numero2);
                System.out.println("Multiplicaçao: " + resultadoMultiplicacao);
                break;
            case "divisao":
                divisao(numero1, numero2);
           
        }
        scanner.close();
    }
    public static double multiplicar(double numero1, double numero2) {
        double multiplica = numero1 * numero2;
        return multiplica;
    }
    public static void soma(double numero1, double numero2) {
        double somar  = numero1 + numero2;
        System.out.println("Soma: " + somar );
    }
    public static void subtracao(double numero1, double numero2) {
        double subtrair= numero1 - numero2;
        System.out.println("Subtracao: " + subtrair );
    }
     public static void divisao(double numero1, double numero2) {
            double dividir = numero1 / numero2;
            System.out.println("Divisao : " + dividir);
        
    }
}

  
  

  
