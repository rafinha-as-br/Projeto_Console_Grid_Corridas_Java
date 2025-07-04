package org.edu.ifsc.Java_Grid_F1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        equipe1.setListaPilotos(List.of(piloto1, piloto2));
        equipe2.setListaPilotos(List.of(piloto3, piloto4));
        equipe3.setListaPilotos(List.of(piloto5, piloto6));
        equipe4.setListaPilotos(List.of(piloto7, piloto8));
        equipe5.setListaPilotos(List.of(piloto9, piloto10));
        equipe6.setListaPilotos(List.of(piloto11, piloto12));
        equipe7.setListaPilotos(List.of(piloto13, piloto14));
        equipe8.setListaPilotos(List.of(piloto15, piloto16));
        equipe9.setListaPilotos(List.of(piloto17, piloto18));
        equipe10.setListaPilotos(List.of(piloto19, piloto20));
        // Vai inicalizar um gerenciadorMenu
        Scanner Scan = new Scanner(System.in);

        System.out.println("Equipes no Campeonato: ");
        System.out.println("Red Bull");
        System.out.println("Racing Bulls");
        System.out.println("Ferrari");
        System.out.println("McLaren");
        System.out.println("Mercedes");
        System.out.println("Aston Martin");
        System.out.println("Alpine");
        System.out.println("Haas");
        System.out.println("Sauber (Stake)");
        System.out.println("Williams");


        // Vai gerar um menu (como se já tivesse sido informado as equipes, pilotos e corrida provisóriamente)
        // Switch case para cada uma das opções do menu

        System.out.println("");



    }
}