package app;

import guerreiros.Assassino;
import guerreiros.Mago;
import guerreiros.Guerreiro;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Guerreiro guerreiro = null;

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Criar Assassino");
            System.out.println("2. Criar Mago");
            System.out.println("3. Exibir Status");
            System.out.println("4. Atacar");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do Assassino: ");
                    String nomeA = scanner.nextLine();
                    System.out.print("Digite o nível: ");
                    int nivelA = scanner.nextInt();
                    System.out.print("Digite a vida: ");
                    int vidaA = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    System.out.print("Digite a arma: ");
                    String arma = scanner.nextLine();
                    guerreiro = new Assassino(nomeA, nivelA, vidaA, arma);
                    System.out.println("Assassino criado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o nome do Mago: ");
                    String nomeM = scanner.nextLine();
                    System.out.print("Digite o nível: ");
                    int nivelM = scanner.nextInt();
                    System.out.print("Digite a vida: ");
                    int vidaM = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    System.out.print("Digite o elemento da magia: ");
                    String elemento = scanner.nextLine();
                    guerreiro = new Mago(nomeM, nivelM, vidaM, elemento);
                    System.out.println("Mago criado com sucesso!");
                    break;
                case 3:
                    if (guerreiro != null) {
                        guerreiro.exibirStatus();
                    } else {
                        System.out.println("Nenhum guerreiro criado ainda!");
                    }
                    break;
                case 4:
                    if (guerreiro != null) {
                        guerreiro.atacar();
                    } else {
                        System.out.println("Nenhum guerreiro criado ainda!");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
