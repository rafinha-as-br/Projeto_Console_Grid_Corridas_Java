package org.edu.ifsc.Java_Grid_F1;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        //lista de equipes

        Equipe equipe1 = new Equipe("Red bull", new ArrayList<>());
        Equipe equipe2 = new Equipe("Racing Bulls", new ArrayList<>());
        Equipe equipe3 = new Equipe("Ferrari", new ArrayList<>());
        Equipe equipe4 = new Equipe("McLaren", new ArrayList<>());
        Equipe equipe5 = new Equipe("Mercedes", new ArrayList<>());
        Equipe equipe6 = new Equipe("Aston Martin", new ArrayList<>());
        Equipe equipe7 = new Equipe("Alpine", new ArrayList<>());
        Equipe equipe8 = new Equipe("Haas", new ArrayList<>());
        Equipe equipe9 = new Equipe("Sauber (Stake)", new ArrayList<>());
        Equipe equipe10 = new Equipe("Williams", new ArrayList<>());

        List<Equipe> listaDeEquipes = new ArrayList<>(Arrays.asList(equipe1, equipe2, equipe3, equipe4, equipe5, equipe6, equipe7, equipe8, equipe9, equipe10));


        //lista de pilotos
        List<Piloto> listaPilotos = new ArrayList<>();

        Piloto piloto1 = new Piloto("Max Verstappen", equipe1,"1");
        listaPilotos.add(piloto1);

        Piloto piloto2 = new Piloto("Yuki Tsunoda",equipe1,"22");
        listaPilotos.add(piloto2);

        Piloto piloto3 = new Piloto("Liam Lawson",equipe2,"30");
        listaPilotos.add(piloto3);

        Piloto piloto4 = new Piloto("Isack Hadjar",equipe2,"6");
        listaPilotos.add(piloto4);

        Piloto piloto5 = new Piloto("Charles Leclerc",equipe3,"16");
        listaPilotos.add(piloto5);

        Piloto piloto6 = new Piloto("Lewis Hamilton",equipe3,"44");
        listaPilotos.add(piloto6);

        Piloto piloto7 = new Piloto("Lando Norris",equipe4,"4");
        listaPilotos.add(piloto7);

        Piloto piloto8 = new Piloto("Oscar Piastri",equipe4,"81");
        listaPilotos.add(piloto8);

        Piloto piloto9 = new Piloto("George Russell",equipe5,"63");
        listaPilotos.add(piloto9);

        Piloto piloto10 = new Piloto("Andrea Kimi Antonelli",equipe5,"12");
        listaPilotos.add(piloto10);

        Piloto piloto11 = new Piloto("Fernando Alonso",equipe6,"14");
        listaPilotos.add(piloto11);

        Piloto piloto12 = new Piloto("Lance Stroll",equipe6,"18");
        listaPilotos.add(piloto12);

        Piloto piloto13 = new Piloto("Pierre Gasly",equipe7,"10");
        listaPilotos.add(piloto13);

        Piloto piloto14 = new Piloto("Jack Doohan",equipe7,"7");
        listaPilotos.add(piloto14);

        Piloto piloto15 = new Piloto("Esteban Ocon",equipe8,"31");
        listaPilotos.add(piloto15);

        Piloto piloto16 = new Piloto("Oliver Bearman",equipe8,"87");
        listaPilotos.add(piloto16);

        Piloto piloto17 = new Piloto("Nico Hülkenberg",equipe9,"27");
        listaPilotos.add(piloto17);

        Piloto piloto18 = new Piloto("Gabriel Bortoleto",equipe9,"5");
        listaPilotos.add(piloto18);

        Piloto piloto19 = new Piloto("Alex Albon",equipe10,"23");
        listaPilotos.add(piloto19);

        Piloto piloto20 = new Piloto("Carlos Sainz",equipe10,"55");
        listaPilotos.add(piloto20);

        Piloto piloto21 = new Piloto("Franco Colapinto", equipe7,"43");
        listaPilotos.add(piloto21);




        equipe1.setListaPilotos(List.of(piloto1, piloto2));
        equipe2.setListaPilotos(List.of(piloto3, piloto4));
        equipe3.setListaPilotos(List.of(piloto5, piloto6));
        equipe4.setListaPilotos(List.of(piloto7, piloto8));
        equipe5.setListaPilotos(List.of(piloto9, piloto10));
        equipe6.setListaPilotos(List.of(piloto11, piloto12));
        equipe7.setListaPilotos(List.of(piloto13, piloto14, piloto21));
        equipe8.setListaPilotos(List.of(piloto15, piloto16));
        equipe9.setListaPilotos(List.of(piloto17, piloto18));
        equipe10.setListaPilotos(List.of(piloto19, piloto20));



        //Criando uma lista de corridas
        List<Corrida> listaDeCorridas = new ArrayList<>();


        //cadastro dos gps a essa lista
        Corrida gp_Australia = new Corrida("Grande prêmio da australia" ,new ArrayList<>(Arrays.asList(
                piloto7,
                piloto1,
                piloto9,
                piloto10,
                piloto19,
                piloto12,
                piloto17,
                piloto5,
                piloto8,
                piloto6,
                piloto13,
                piloto2,
                piloto15,
                piloto16,
                piloto3,
                piloto18,
                piloto11,
                piloto20,
                piloto14,
                piloto4
        )));

        listaDeCorridas.add(gp_Australia);
        Corrida gp_China = new Corrida("Grande Prêmio da China",new ArrayList<>(Arrays.asList(
                piloto8,
                piloto7,
                piloto9,
                piloto1,
                piloto15,
                piloto10,
                piloto19,
                piloto16,
                piloto12,
                piloto20,
                piloto4,
                piloto3,
                piloto14,
                piloto18,
                piloto17,
                piloto2,
                piloto11,
                piloto5,
                piloto6,
                piloto13
        )));

        listaDeCorridas.add(gp_China);

        Corrida gp_Japao = new Corrida("Grande Prêmio do Japão" ,new ArrayList<>(Arrays.asList(
                piloto1,
                piloto7,
                piloto8,
                piloto5,
                piloto9,
                piloto10,
                piloto6,
                piloto4,
                piloto19,
                piloto16,
                piloto11,
                piloto2,
                piloto13,
                piloto20,
                piloto14,
                piloto17,
                piloto3,
                piloto15,
                piloto18,
                piloto12
        )));

        listaDeCorridas.add(gp_Japao);

        Corrida gp_Bahrein = new Corrida("Grande Prêmio do Bahrein",new ArrayList<>(Arrays.asList(
                piloto8,
                piloto9,
                piloto7,
                piloto5,
                piloto6,
                piloto1,
                piloto13,
                piloto15,
                piloto2,
                piloto16,
                piloto10,
                piloto19,
                piloto4,
                piloto14,
                piloto11,
                piloto3,
                piloto12,
                piloto18,
                piloto20,
                piloto17
        )));

        listaDeCorridas.add(gp_Bahrein);

        Corrida gp_Arabia_Saudita = new Corrida("Grande Prêmio da Arábia Saudita",new ArrayList<>(Arrays.asList(
                piloto8,
                piloto1,
                piloto5,
                piloto7,
                piloto9,
                piloto10,
                piloto6,
                piloto20,
                piloto19,
                piloto4,
                piloto11,
                piloto3,
                piloto16,
                piloto15,
                piloto17,
                piloto12,
                piloto14,
                piloto18,
                piloto2,
                piloto13
        )));

        listaDeCorridas.add(gp_Arabia_Saudita);

        Corrida gp_Miami = new Corrida("Grande Prêmio de Miami",new ArrayList<>(Arrays.asList(
                piloto8,
                piloto7,
                piloto9,
                piloto1,
                piloto19,
                piloto10,
                piloto5,
                piloto6,
                piloto20,
                piloto2,
                piloto4,
                piloto15,
                piloto13,
                piloto17,
                piloto11,
                piloto12,
                piloto3,
                piloto18,
                piloto16,
                piloto14
        )));

        listaDeCorridas.add(gp_Miami);

        Corrida gp_Emilia_Romagna = new Corrida("Grande Prêmio da Emilia Romagna",new ArrayList<>(Arrays.asList(
                piloto1,
                piloto7,
                piloto8,
                piloto6,
                piloto19,
                piloto5,
                piloto9,
                piloto20,
                piloto4,
                piloto2,
                piloto17,
                piloto11,
                piloto13,
                piloto3,
                piloto12,
                piloto21,
                piloto16,
                piloto18,
                piloto10,
                piloto15
        )));

        listaDeCorridas.add(gp_Emilia_Romagna);

        Corrida gp_Monaco = new Corrida("Grande Prêmio de Monte Carlo",new ArrayList<>(Arrays.asList(
                piloto7,
                piloto5,
                piloto8,
                piloto1,
                piloto6,
                piloto4,
                piloto15,
                piloto3,
                piloto19,
                piloto20,
                piloto9,
                piloto16,
                piloto21,
                piloto18,
                piloto12,
                piloto17,
                piloto2,
                piloto10,
                piloto11,
                piloto13
        )));

        listaDeCorridas.add(gp_Monaco);

        Corrida gp_Espanha = new Corrida("Grande Prêmio da Espanha",new ArrayList<>(Arrays.asList(
                piloto8,
                piloto7,
                piloto5,
                piloto9,
                piloto17,
                piloto6,
                piloto4,
                piloto13,
                piloto11,
                piloto1,
                piloto3,
                piloto18,
                piloto2,
                piloto20,
                piloto21,
                piloto15,
                piloto16,
                piloto10,
                piloto19,
                piloto12
        )));

        listaDeCorridas.add(gp_Espanha);

        Corrida gp_Canada = new Corrida("Grande Prêmio do Canadá",new ArrayList<>(Arrays.asList(
                piloto9,
                piloto1,
                piloto10,
                piloto8,
                piloto5,
                piloto6,
                piloto11,
                piloto17,
                piloto15,
                piloto20,
                piloto16,
                piloto2,
                piloto21,
                piloto18,
                piloto13,
                piloto4,
                piloto12,
                piloto7,
                piloto3,
                piloto19
        )));

        listaDeCorridas.add(gp_Canada);

        Corrida gp_Austria = new Corrida("Grande Prêmio da Áustria", new ArrayList<>(Arrays.asList(
                piloto7,
                piloto8,
                piloto5,
                piloto6,
                piloto9,
                piloto3,
                piloto11,
                piloto18,
                piloto17,
                piloto15,
                piloto16,
                piloto4,
                piloto13,
                piloto12,
                piloto21,
                piloto2,
                piloto19,
                piloto1,
                piloto10,
                piloto20
        )));

        listaDeCorridas.add(gp_Austria);

        Corrida gp_Gra_Bretanha = new Corrida("Grande Prêmio da Inglaterra",new ArrayList<>(Arrays.asList(
                piloto7,
                piloto8,
                piloto17,
                piloto6,
                piloto1,
                piloto13,
                piloto12,
                piloto19,
                piloto11,
                piloto9,
                piloto16,
                piloto20,
                piloto15,
                piloto5,
                piloto2,
                piloto10,
                piloto4,
                piloto18,
                piloto3,
                piloto21
        )));

        listaDeCorridas.add(gp_Gra_Bretanha);

        //Instanciando um campeonato
        Campeonato campeonatoF1 = new Campeonato(listaDeCorridas, listaPilotos, listaDeEquipes);

        GerenciadorMenu menu = new GerenciadorMenu(campeonatoF1);

        //iniciando o menu
        menu.exibirMenu();

    }
}