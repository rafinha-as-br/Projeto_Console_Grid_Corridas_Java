package org.edu.ifsc.Java_Grid_F1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Piloto piloto1 = new Piloto("Max Verstappen","Red Bull Racing","1");
        Piloto piloto2 = new Piloto("Yuki Tsunoda","Red Bull Racing","22");
        Piloto piloto3 = new Piloto("Liam Lawson","Racing Bulls","30");
        Piloto piloto4 = new Piloto("Isack Hadjar","Racing Bulls","6");
        Piloto piloto5 = new Piloto("Charles Leclerc","Ferrari","16");
        Piloto piloto6 = new Piloto("Lewis Hamilton","Ferrari","44");
        Piloto piloto7 = new Piloto("Lando Norris","McLaren","4");
        Piloto piloto8 = new Piloto("Oscar Piastri","McLaren","81");
        Piloto piloto9 = new Piloto("George Russell","Mercedes","63");
        Piloto piloto10 = new Piloto("Andrea Kimi Antonelli","Mercedes","12");
        Piloto piloto11 = new Piloto("Fernando Alonso","Aston Martin","14");
        Piloto piloto12 = new Piloto("Lance Stroll","Aston Martin","18");
        Piloto piloto13 = new Piloto("Pierre Gasly","Alpine","10");
        Piloto piloto14 = new Piloto("Jack Doohan","Alpine","7");
        Piloto piloto15 = new Piloto("Esteban Ocon","Haas","31");
        Piloto piloto16 = new Piloto("Oliver Bearman","Haas","87");
        Piloto piloto17 = new Piloto("Nico Hülkenberg","Sauber (Stake)","27");
        Piloto piloto18 = new Piloto("Gabriel Bortoleto","Sauber (Stake)","5");
        Piloto piloto19 = new Piloto("Alex Albon","Williams","23");
        Piloto piloto20 = new Piloto("Carlos Sainz","Williams","55");

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

    }
}