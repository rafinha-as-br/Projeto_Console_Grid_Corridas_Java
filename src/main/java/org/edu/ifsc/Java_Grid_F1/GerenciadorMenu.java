package org.edu.ifsc.Java_Grid_F1;

import org.apache.commons.lang3.StringUtils;

import java.util.Collections;
import java.util.Comparator;
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
                    while (opcao2!=900){
                        System.out.println("Opção escolhida: Listar corridas");
                        System.out.println("Escolha o numero da corrida para ver o resultado dessa corrida");
                        System.out.println("Digite 900 para sair \n");
                        listarCorridas(campeonato.listadeCorridas);
                        try {
                            opcao2 = Integer.parseInt(scanner.nextLine());
                            if (opcao2==900){
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

    public void listarCorridas(List<Corrida> listaCorridas) {
        FormatadorRelatorios.cabecalho("CALENDÁRIO DE CORRIDAS 2024");
        FormatadorRelatorios.cabecalho2Colunas("CÓD", "CORRIDA");

        for(int i = 0; i < listaCorridas.size(); i++) {
            FormatadorRelatorios.linha2Colunas(
                    (i),  // Codigo numerico
                    listaCorridas.get(i).nomeCorrida  // nome completo do GP
            );
        }
        FormatadorRelatorios.rodape();
    }

    public void resultadoCorrida(Corrida corrida) {
        campeonato.calculaPontuacoesCorrida(corrida);

        FormatadorRelatorios.cabecalho(corrida.nomeCorrida.toUpperCase());
        FormatadorRelatorios.cabecalho5Colunas("POS", "NÚM", "PILOTO", "EQUIPE", "PTS");

        for(int i = 0; i < corrida.resultadoCorrida.size(); i++) {
            Piloto p = corrida.resultadoCorrida.get(i);
            FormatadorRelatorios.linha5Colunas(
                    (i+1),
                    p._numeroPiloto,
                    p._nome,
                    p._equipe.nome,
                    p.pontos
            );
        }
        FormatadorRelatorios.rodape();
    }

    public void listarPilotos(List<Piloto> listaDePilotos) {
        FormatadorRelatorios.cabecalho("LISTAGEM COMPLETA DE PILOTOS");
        FormatadorRelatorios.cabecalho5Colunas("#", "NÚMERO", "NOME", "EQUIPE", "PTS");

        listaDePilotos.sort(Comparator.comparing(p -> p._nome));

        for (int i = 0; i < listaDePilotos.size(); i++) {
            Piloto piloto = listaDePilotos.get(i);
            FormatadorRelatorios.linha5Colunas(
                    (i+1),
                    piloto._numeroPiloto,
                    piloto._nome,
                    piloto._equipe.nome,
                    piloto.pontos
            );
        }
        FormatadorRelatorios.rodape();
    }

    public void listarEquipes(List<Equipe> listaDeEquipes) {
        FormatadorRelatorios.cabecalho("LISTAGEM COMPLETA DE EQUIPES");
        FormatadorRelatorios.cabecalho2Colunas("EQUIPE", "PILOTOS");

        listaDeEquipes.sort(Comparator.comparing(e -> e.nome));

        for (Equipe equipe : listaDeEquipes) {
            StringBuilder pilotosBuilder = new StringBuilder();
            for (int i = 0; i < equipe.listaPilotos.size(); i++) {
                if (i > 0) {
                    if (i % 3 == 0) {
                        pilotosBuilder.append("\n").append(StringUtils.repeat(" ", 31)).append("> ");
                    } else {
                        pilotosBuilder.append(", ");
                    }
                }
                pilotosBuilder.append(equipe.listaPilotos.get(i)._nome);
            }

            FormatadorRelatorios.linha2Colunas(
                    equipe.nome,
                    pilotosBuilder.toString()
            );
        }
        FormatadorRelatorios.rodape();
    }

    public void imprimeResultadoCampeonatoPiloto(Campeonato campeonato) {
        List<Piloto> resultado = campeonato.calculaPilotosCampeonato(campeonato.listadeCorridas, campeonato.listadePiloto);

        FormatadorRelatorios.cabecalho("CAMPEONATO DE PILOTOS - CLASSIFICAÇÃO FINAL");
        FormatadorRelatorios.cabecalho5Colunas("POS", "NÚM", "PILOTO", "EQUIPE", "PTS");

        for(int i = 0; i < resultado.size(); i++) {
            Piloto p = resultado.get(i);
            FormatadorRelatorios.linha5Colunas(
                    (i+1),
                    p._numeroPiloto,
                    p._nome,
                    p._equipe.nome,
                    p.pontos
            );
        }
        FormatadorRelatorios.rodape();
    }

    public void imprimeResultadoCampeonatoConstrutores(Campeonato campeonato) {
        List<Equipe> resultado = campeonato.calculaEquipesCampeonato(campeonato.listadeCorridas, campeonato.listadeEquipes);
        Collections.reverse(resultado);

        FormatadorRelatorios.cabecalho("CAMPEONATO DE CONSTRUTORES");
        FormatadorRelatorios.cabecalho3Colunas("POS", "EQUIPE", "PTS");

        for(int i = 0; i < resultado.size(); i++) {
            Equipe e = resultado.get(i);
            FormatadorRelatorios.linha3Colunas(
                    (i+1),
                    e.nome,
                    e.pontos
            );
        }
        FormatadorRelatorios.rodape();
    }

}
