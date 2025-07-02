import java.util.Scanner;

public class jogoVelha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[][] matriz = new String[3][3];
            boolean jogadorX = true;
            boolean venceu = false;
            int jogadas = 0;

            for (int i = 0; i < 3; i++) {
                for (int y = 0; y < 3; y++) {
                    matriz[i][y] = " ";
                }
            }

            while (!venceu && jogadas < 9) {
                System.out.println("\nJOGO:");
                for (int i = 0; i < 3; i++) {
                    for (int y = 0; y < 3; y++) {
                        System.out.print("[" + matriz[i][y] + "]");
                    }
                    System.out.println();
                }

                System.out.println("\nVez do jogador " + (jogadorX ? "X" : "O"));
                System.out.print("Digite a linha (0-2): ");
                int linha = scanner.nextInt();
                System.out.print("Digite a coluna (0-2): ");
                int coluna = scanner.nextInt();

                if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || !matriz[linha][coluna].equals(" ")) {
                    System.out.println("Jogada inválida, tente novamente.");
                    continue;
                }

                String simbolo = jogadorX ? "X" : "O";
                matriz[linha][coluna] = simbolo;
                jogadas++;

                venceu = verificarVencedor(matriz, simbolo);

                if (venceu) {
                    System.out.println("\nJOGO:");
                    for (int i = 0; i < 3; i++) {
                        for (int y = 0; y < 3; y++) {
                            System.out.print("[" + matriz[i][y] + "]");
                        }
                        System.out.println();
                    }
                    System.out.println("Jogador " + simbolo + " venceu!");
                } else if (jogadas == 9) {
                    System.out.println("\nEmpate!");
                }

                jogadorX = !jogadorX;
            }

            System.out.print("\nDeseja jogar novamente? (s/n): ");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }

        scanner.close();
    }

    public static boolean verificarVencedor(String[][] matriz, String simbolo) {
        for (int i = 0; i < 3; i++) {
            if (matriz[i][0].equals(simbolo) && matriz[i][1].equals(simbolo) && matriz[i][2].equals(simbolo)) {
                return true;
            }
            if (matriz[0][i].equals(simbolo) && matriz[1][i].equals(simbolo) && matriz[2][i].equals(simbolo)) {
                return true;
            }
        }
        if (matriz[0][0].equals(simbolo) && matriz[1][1].equals(simbolo) && matriz[2][2].equals(simbolo)) {
            return true;
        }
        if (matriz[0][2].equals(simbolo) && matriz[1][1].equals(simbolo) && matriz[2][0].equals(simbolo)) {
            return true;
        }

        return false;
    }
}
