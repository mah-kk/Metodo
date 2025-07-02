/* Crie uma aplicação em Java que simule o jogo da velha para dois jogadores no console.
Requisitos:
1. O jogo deve ser jogado no terminal (modo texto).
2. O jogo deve ser uma matriz 3x3.
3. Dois jogadores devem alterar turnos, jogando com "X" e "O".
4. O jogo deve verificar cada linha jogada:
    1. Se houver vencedor (linha, coluna ou diagonal).
    2. Se houver empate (todas as casas preenchidas sem vencedor).
5. O programa deve exibir cada tabuleiro atualizado após cada jogada.
6. Deve ser possível reiniciar ou encerrar o jogo no final da partida.

Objetivo:
Praticar estruturas de repetição, condicionais, arrays e manipulação de entradas/saídas no console.
*/

import java.util.Scanner;

public class jogoDaVelha {

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
}

         