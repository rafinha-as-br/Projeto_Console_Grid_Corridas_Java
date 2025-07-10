package org.edu.ifsc.Java_Grid_F1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

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

        Piloto piloto1 = new Piloto("Max Verstappen", equipe1,"1");
        Piloto piloto2 = new Piloto("Yuki Tsunoda",equipe1,"22");
        Piloto piloto3 = new Piloto("Liam Lawson",equipe2,"30");
        Piloto piloto4 = new Piloto("Isack Hadjar",equipe2,"6");
        Piloto piloto5 = new Piloto("Charles Leclerc",equipe3,"16");
        Piloto piloto6 = new Piloto("Lewis Hamilton",equipe3,"44");
        Piloto piloto7 = new Piloto("Lando Norris",equipe4,"4");
        Piloto piloto8 = new Piloto("Oscar Piastri",equipe4,"81");
        Piloto piloto9 = new Piloto("George Russell",equipe5,"63");
        Piloto piloto10 = new Piloto("Andrea Kimi Antonelli",equipe5,"12");
        Piloto piloto11 = new Piloto("Fernando Alonso",equipe6,"14");
        Piloto piloto12 = new Piloto("Lance Stroll",equipe6,"18");
        Piloto piloto13 = new Piloto("Pierre Gasly",equipe7,"10");
        Piloto piloto14 = new Piloto("Jack Doohan",equipe7,"7");
        Piloto piloto15 = new Piloto("Esteban Ocon",equipe8,"31");
        Piloto piloto16 = new Piloto("Oliver Bearman",equipe8,"87");
        Piloto piloto17 = new Piloto("Nico Hülkenberg",equipe9,"27");
        Piloto piloto18 = new Piloto("Gabriel Bortoleto",equipe9,"5");
        Piloto piloto19 = new Piloto("Alex Albon",equipe10,"23");
        Piloto piloto20 = new Piloto("Carlos Sainz",equipe10,"55");
        Piloto piloto21 = new Piloto("Franco Colapinto", equipe7,"43");

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

        //cadastro dos gps
        Corrida gp_Autralia = new Corrida(new ArrayList<>(Arrays.asList(
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
        Corrida gp_China = new Corrida(new ArrayList<>(Arrays.asList(
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
        Corrida gp_Japao = new Corrida(new ArrayList<>(Arrays.asList(
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
        Corrida gp_Bahrein = new Corrida(new ArrayList<>(Arrays.asList(
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
        Corrida gp_Arabia_Saudita = new Corrida(new ArrayList<>(Arrays.asList(
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
        Corrida gp_Miami = new Corrida(new ArrayList<>(Arrays.asList(
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
        Corrida gp_Emilia_Romagna = new Corrida(new ArrayList<>(Arrays.asList(
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
        Corrida gp_Monaco = new Corrida(new ArrayList<>(Arrays.asList(
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
        Corrida gp_Espanha = new Corrida(new ArrayList<>(Arrays.asList(
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
        Corrida gp_Canada = new Corrida(new ArrayList<>(Arrays.asList(
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
        Corrida gp_Austria = new Corrida(new ArrayList<>(Arrays.asList(
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
        Corrida gp_Gra_Bretanha = new Corrida(new ArrayList<>(Arrays.asList(
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

        GerenciadorMenu menu = new GerenciadorMenu(gp_Autralia, gp_China, gp_Japao, gp_Bahrein, gp_Arabia_Saudita, gp_Miami, gp_Emilia_Romagna, gp_Monaco, gp_Espanha, gp_Canada, gp_Austria, gp_Gra_Bretanha);

        // Vai inicalizar um gerenciadorMenu
        menu.exibirMenu();

    }
}