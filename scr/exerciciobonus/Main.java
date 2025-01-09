package scr.exerciciobonus;


import scr.exerciciobonus.menu.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean menuAberto = true;

        while (menuAberto) {
            Menu.Mostrar();

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Produzindo cadastro de cliente...");
            } else if (opcao == 2) {
                System.out.println("Produzindo criar conta");
            } else if (opcao == 3) {
                System.out.println("Produzindo realizar saque");
            } else if (opcao == 4) {
                System.out.println("Produzindo realizar depósito");
            } else if (opcao == 5) {
                System.out.println("Saindo do sistema...");
                menuAberto = false;
            } else {
                System.out.println("Opção inválida. Digite uma opção do menu!");
            }
        }
        scanner.close();

    }
}