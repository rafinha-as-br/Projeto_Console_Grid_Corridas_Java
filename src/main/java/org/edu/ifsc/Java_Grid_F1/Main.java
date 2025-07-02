package org.edu.ifsc.Java_Grid_F1;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Piloto piloto1 = new Piloto("Max Verstappen","1");
        Piloto piloto2 = new Piloto("Yuki Tsunoda","22");
        Piloto piloto3 = new Piloto("Liam Lawson","30");
        Piloto piloto4 = new Piloto("Isack Hadjar","6");
        Piloto piloto5 = new Piloto("Charles Leclerc","16");
        Piloto piloto6 = new Piloto("Lewis Hamilton","44");
        Piloto piloto7 = new Piloto("Lando Norris","4");
        Piloto piloto8 = new Piloto("Oscar Piastri","81");
        Piloto piloto9 = new Piloto("George Russell","63");
        Piloto piloto10 = new Piloto("Andrea Kimi Antonelli","12");
        Piloto piloto11 = new Piloto("Fernando Alonso","14");
        Piloto piloto12 = new Piloto("Lance Stroll","18");
        Piloto piloto13 = new Piloto("Pierre Gasly","10");
        Piloto piloto14 = new Piloto("Jack Doohan","7");
        Piloto piloto15 = new Piloto("Esteban Ocon","31");
        Piloto piloto16 = new Piloto("Oliver Bearman","87");
        Piloto piloto17 = new Piloto("Nico Hülkenberg","27");
        Piloto piloto18 = new Piloto("Gabriel Bortoleto","5");
        Piloto piloto19 = new Piloto("Alex Albon","23");
        Piloto piloto20 = new Piloto("Carlos Sainz","55");

        Equipe equipe1 = new Equipe("Red bull", List.of(piloto1, piloto2));
        Equipe equipe2 = new Equipe("Racing Bulls", List.of(piloto3, piloto4));
        Equipe equipe3 = new Equipe("Ferrari", List.of(piloto5, piloto6));
        Equipe equipe4 = new Equipe("McLaren", List.of(piloto7, piloto8));
        Equipe equipe5 = new Equipe("Mercedes", List.of(piloto9, piloto10));
        Equipe equipe6 = new Equipe("Aston Martin", List.of(piloto11, piloto12));
        Equipe equipe7 = new Equipe("Alpine", List.of(piloto13, piloto14));
        Equipe equipe8 = new Equipe("Haas", List.of(piloto15, piloto16));
        Equipe equipe9 = new Equipe("Sauber (Stake)", List.of(piloto17, piloto18));
        Equipe equipe10 = new Equipe("Williams", List.of(piloto19, piloto20));

        // Vai inicalizar um gerenciadorMenu
        Scanner Scan = new Scanner(System.in);

        System.out.println("Equipes no Campionato: ");
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