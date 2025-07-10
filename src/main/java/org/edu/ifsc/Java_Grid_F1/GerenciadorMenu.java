package org.edu.ifsc.Java_Grid_F1;

import java.util.Scanner;

public class GerenciadorMenu {

    // Puxa os gp do nenu
    private Corrida gp_Autralia;
    private Corrida gp_China;
    private Corrida gp_Japao;
    private Corrida gp_Bahrein;
    private Corrida gp_Arabia_Saudita;
    private Corrida gp_Miami;
    private Corrida gp_Emilia_Romagna;
    private Corrida gp_Monaco;
    private Corrida gp_Espanha;
    private Corrida gp_Canada;
    private Corrida gp_Austria;
    private Corrida gp_Gra_Bretanha;

    private Scanner scanner = new Scanner(System.in);

    // Armazena os GP
    public GerenciadorMenu(Corrida gp_Autralia, Corrida gp_China, Corrida gp_Japao, Corrida gp_Bahrein, Corrida gp_Arabia_Saudita, Corrida gpMiami, Corrida gpEmiliaRomagna, Corrida gpMonaco, Corrida gpEspanha, Corrida gpCanada, Corrida gpAustria, Corrida gpGraBretanha) {
        this.gp_Autralia = gp_Autralia;
        this.gp_China = gp_China;
        this.gp_Japao = gp_Japao;
        this.gp_Bahrein = gp_Bahrein;
        this.gp_Arabia_Saudita = gp_Arabia_Saudita;
        this.gp_Miami = gp_Miami;
        this.gp_Emilia_Romagna = gp_Emilia_Romagna;
        this.gp_Monaco = gp_Monaco;
        this.gp_Espanha = gp_Espanha;
        this.gp_Canada = gp_Canada;
        this.gp_Austria = gp_Austria;
        this.gp_Gra_Bretanha = gp_Gra_Bretanha;
    }

    public void exibirMenu() {
        int opcao = -1;
        int gp;
        int posicao = 1;

        while (opcao != 0) {
            // Menu de opções
            System.out.println("1 - Lista de Circuitos");
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
                    Corrida.listarGP();
                    System.out.print("Escolha um GP: ");
                    gp = scanner.nextInt();
                    scanner.nextLine();

                    switch (gp) {
                        case 1:
                            posicao = 1;
                            for (Piloto p : gp_Autralia.resultadoCorrida) {
                                System.out.println(posicao + "°:" + p._nome);
                                posicao++;
                            }
                            System.out.println("");
                            break;
                        case 2:
                            posicao = 1;
                            for (Piloto p : gp_China.resultadoCorrida) {
                                System.out.println(posicao + "°:" + p._nome);
                                posicao++;
                            }
                            System.out.println("");
                            break;
                        case 3:
                            posicao = 1;
                            for (Piloto p : gp_Japao.resultadoCorrida) {
                                System.out.println(posicao + "°:" + p._nome);
                                posicao++;
                            }
                            System.out.println("");
                            break;
                        case 4:
                            posicao = 1;
                            for (Piloto p : gp_Bahrein.resultadoCorrida) {
                                System.out.println(posicao + "°:" + p._nome);
                                posicao++;
                            }
                            System.out.println("");
                            break;
                        case 5:
                            posicao = 1;
                            for (Piloto p : gp_Arabia_Saudita.resultadoCorrida) {
                                System.out.println(posicao + "°:" + p._nome);
                                posicao++;
                            }
                            System.out.println("");
                            break;
                        case 6:
                            posicao = 1;
                            for (Piloto p : gp_Miami.resultadoCorrida) {
                                System.out.println(posicao + "°:" + p._nome);
                                posicao++;
                            }
                            System.out.println("");
                            break;
                        case 7:
                            posicao = 1;
                            for (Piloto p : gp_Emilia_Romagna.resultadoCorrida) {
                                System.out.println(posicao + "°:" + p._nome);
                                posicao++;
                            }
                            System.out.println("");
                            break;
                        case 8:
                            posicao = 1;
                            for (Piloto p : gp_Monaco.resultadoCorrida) {
                                System.out.println(posicao + "°:" + p._nome);
                                posicao++;
                            }
                            System.out.println("");
                            break;
                        case 9:
                            posicao = 1;
                                for (Piloto p : gp_Espanha.resultadoCorrida) {
                                    System.out.println(posicao + "°:" + p._nome);
                                    posicao++;
                                }
                                System.out.println("");
                                break;
                        case 10:
                            posicao = 1;
                            for (Piloto p : gp_Canada.resultadoCorrida) {
                                System.out.println(posicao + "°:" + p._nome);
                                posicao++;
                            }
                            System.out.println("");
                            break;
                        case 11:
                            posicao = 1;
                            for (Piloto p : gp_Austria.resultadoCorrida) {
                                System.out.println(posicao + "°:" + p._nome);
                                posicao++;
                            }
                            System.out.println("");
                            break;
                        case 12:
                            posicao = 1;
                            for (Piloto p : gp_Gra_Bretanha.resultadoCorrida) {
                                System.out.println(posicao + "°:" + p._nome);
                                posicao++;
                            }
                            System.out.println("");
                            break;
                        default:
                            System.out.println("GP inválido!");
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
}
