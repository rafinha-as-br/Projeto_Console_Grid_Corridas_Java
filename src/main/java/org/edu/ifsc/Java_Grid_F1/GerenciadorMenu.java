package org.edu.ifsc.Java_Grid_F1;

import java.util.List;
import java.util.Scanner;

public class GerenciadorMenu {

   //armazenando uma instância de campeonato
    Campeonato campeonato;

    public GerenciadorMenu(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    private Scanner scanner = new Scanner(System.in);


    public void exibirMenu() {
        int opcao = -1;
        int opcao2 = -1;
        int gp;
        int posicao = 1;

        while (opcao != 0) {
            // Menu de opções
            System.out.println("1 - Listar corridas");
            System.out.println("2 - Campeonato de pilotos");
            System.out.println("3 - Campeonato de Equipes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            // Le opção se esta digitando um numero
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número.");
                continue;
            }

            switch (opcao) {
                case 1:
                    //função de listar corridas
                    System.out.println("Opção escolhida: Listar corridas");


                    System.out.println("Escolha uma corrida para ver o resultado dessa corrida");
                    opcao2 = Integer.parseInt(scanner.nextLine());
                    Corrida.listarGP();

                    break;

                case 2:
                    System.out.println("Campeonato de Pilotos 2025");
                    Piloto.listarPilotos();
                    break;

                case 3:
                    System.out.println("Campeonato de Equipes 2025");
                    Equipe.listarEquipes();
                    break;

                case 0:
                    System.out.println("Encerrando programa.");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }

    public void listarCorridas(List<Corrida> listaCorridas){
        for(int i=0; i<listaCorridas.size(); i++){
            System.out.println(listaCorridas.get(i));
        }
    }



}
