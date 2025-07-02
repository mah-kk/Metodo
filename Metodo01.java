     public class Metodo01{

// chamada de metodo simples 
     public static void meuMetodo(){
    System.out.println("Chamada de metodo simples");

}
// chamada de metodo com passagem com parametro 
      public static void mostrarNome(String nome ){
        System.out.println("Ola " +nome+ ", voce esta de parabens");

      }

      // Chamada de metodo para multiplicar dois numeros com retorno 
        public static double multiplicar(double numero1, double numero2){
        double multiplica = numero1 * numero2;
        return multiplica; 

        }

       public static void soma(double numero1, double numero2){
        double soma = numero1 + numero2;
        System.out.println ("soma : "+soma);
       }
     
     public static void main( String[] args){
     System.out.println("Chamada de metodo simples");
     meuMetodo();
     meuMetodo();
    
    mostrarNome("Andreisse");

    soma (5,8);
    soma(18,30);

double retorno = multiplicar(5,5);
System.out.println("Retorno: " +retorno);

}

}