package org.edu.ifsc.Java_Grid_F1;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GerenciadorMenu {

   //armazenando uma instância de campeonato
    Campeonato campeonato;

    public GerenciadorMenu(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    private Scanner scanner = new Scanner(System.in);


    // função para exibir o menu
    public void exibirMenu() {
        int opcao = -1;
        int opcao2 = -1;

        while (opcao != 0) {
            // Menu de opções
            System.out.println("1 - Listar corridas");
            System.out.println("2 - Listar pilotos");
            System.out.println("3 - Listar equipes");
            System.out.println("4 - Campeonato de pilotos");
            System.out.println("5 - Campeonato de Equipes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            // Lê opção se esta digitando um número
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número.");
                continue;
            }

            switch (opcao) {
                case 1: //função de listar corridas
                    while (opcao2!=0){
                        System.out.println("Opção escolhida: Listar corridas");
                        System.out.println("Escolha o numero da corrida para ver o resultado dessa corrida");
                        System.out.println("Digite 0 para sair \n");
                        listarCorridas(campeonato.listadeCorridas);
                        try {
                            opcao2 = Integer.parseInt(scanner.nextLine());
                            if (opcao2==0){
                                break;
                            } else if (opcao2 < 0 || opcao2 > campeonato.listadeCorridas.size()-1){
                                System.out.println("Entrada inválida! Digite um número válido na lista de corridas!");
                            } else {
                                resultadoCorrida(campeonato.listadeCorridas.get(opcao2));
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada inválida! Digite um número.");
                        }

                    }
                    opcao2=-1;
                    break;

                case 2:
                    System.out.println("Opção escolhida: Listagem de pilotos \n");
                    //chamando a função listar pilotos passando a lista de pilotos do campeonato
                    listarPilotos(campeonato.listadePiloto);

                    break;

                case 3:
                    System.out.println("Opção escolhida: Listagem de equipes \n");
                    //chamando a função listar equipes passando a lista de equipes do campeonato
                    listarEquipes(campeonato.listadeEquipes);

                    break;

                case 4:
                    System.out.println("Opção escolhida: Campeonato de pilotos \n");
                    //Chamando a função de imprimir o campeonato de pilotos
                    imprimeResultadoCampeonatoPiloto(campeonato);

                    break;

                case 5:
                    System.out.println("Opção escolhida: Campeonato de construtores \n");
                    imprimeResultadoCampeonatoConstrutores(campeonato);
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
            System.out.println(i + "-" + listaCorridas.get(i).nomeCorrida);
        }
    }

    public void resultadoCorrida(Corrida corrida) {
        campeonato.calculaPontuacoesCorrida(corrida);
        System.out.println("\n\n" + corrida.nomeCorrida);
        System.out.println("Posição | Número | Nome | Equipe | Pontos");
        for(int i = 0; i < corrida.resultadoCorrida.size(); i++) {
            Piloto p = corrida.resultadoCorrida.get(i);
            System.out.printf("%-8d| %-7s| %-20s| %-15s| %d%n",
                    i+1, p._numeroPiloto, p._nome, p._equipe.nome, p.pontos);
        }
        System.out.println();
    }

    public void listarPilotos(List<Piloto> listaDePilotos){
        System.out.println("Número | Nome | Equipe ");
        listaDePilotos.forEach(piloto -> System.out.println(piloto._numeroPiloto + piloto._nome + piloto._equipe));
    }

    public void listarEquipes(List<Equipe> listaDeEquipes) {
        System.out.println("Nome | Pilotos");
        listaDeEquipes.forEach(equipe -> {
            StringBuilder pilotosStr = new StringBuilder();
            for (Piloto piloto : equipe.listaPilotos) {
                if (pilotosStr.length() > 0) {
                    pilotosStr.append(", ");
                }
                pilotosStr.append(piloto._nome);
            }
            System.out.println(equipe.nome + pilotosStr.toString());
        });
    }

    public void imprimeResultadoCampeonatoPiloto(Campeonato campeonato) {
        List<Piloto> resultado = campeonato.calculaPilotosCampeonato(campeonato.listadeCorridas, campeonato.listadePiloto);
        Collections.reverse(resultado);
        System.out.println("Posição | Número | Nome | Equipe | Pontos");
        for(int i = 0; i < resultado.size(); i++) {
            Piloto p = resultado.get(i);
            System.out.printf("%-8d| %-7s| %-20s| %-15s| %d%n",
                    i+1, p._numeroPiloto, p._nome, p._equipe.nome, p.pontos);
        }
        System.out.println();
    }


    public void imprimeResultadoCampeonatoConstrutores(Campeonato campeonato) {
        List<Equipe> resultado = campeonato.calculaEquipesCampeonato(campeonato.listadeCorridas, campeonato.listadeEquipes);
        Collections.reverse(resultado);
        System.out.println("Posição | Time | Pontos");
        for(int i = 0; i < resultado.size(); i++) {
            Equipe e = resultado.get(i);
            System.out.printf("%-8d| %-15s| %d%n", i+1, e.nome, e.pontos);
        }
        System.out.println();
    }




}
