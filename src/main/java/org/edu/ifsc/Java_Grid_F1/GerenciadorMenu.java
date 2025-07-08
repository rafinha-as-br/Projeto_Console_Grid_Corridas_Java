package org.edu.ifsc.Java_Grid_F1;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorMenu{
    //implementações de instâncias de campeonato

    private Scanner scanner = new Scanner(System.in);
    public void exibirMenu() {

        int opcao = -1;

        while (opcao != 0){
            System.out.println("1 - Lista de Circuitos");
            System.out.println("2 - Campeonato de pilotos");
            System.out.println("3 - Campeonato de Equipes");
            System.out.println("4 - ");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número.");
                continue;
            }

            switch (opcao){
                case 1:
                    Corrida.listarGP();
                    System.out.println("Escolha um GP");
                    opcao = Integer.parseInt(scanner.nextLine());
                    while (opcao != 0){
                        case 1:
                            System.out.println("1° GP da Austrália - Albert Park");

                            break;
                    }
                    break;
                case 2:
                    System.out.println("Campeonato de Pilotos 2025");
                    Piloto.listarPilotos();
                    break;
                case 3:
                    System.out.println("Campeonato de Equipes 2025");
                    Equipe.listarEquipes();
                    break;
                case 4:

                    break;
                case 0:
                    System.out.println("Encerrando programa");
                    break;
            }
        }
        scanner.close();
    }
}