package org.edu.ifsc.Java_Grid_F1;

import java.util.List;

public class Piloto{
    final String _nome;
    final String _numeroPiloto;
    public Equipe _equipe;
    int pontos;


    public Piloto(String _nome,Equipe equipe, String _numeroPiloto) {
        this._nome = _nome;
        this._equipe = equipe;
        this._numeroPiloto = _numeroPiloto;
        this.pontos = 0;
    }

    public void set_pontos(int pontos) {
        this.pontos += pontos;
    }

    public static void listarPilotos(){
        System.out.println("Max Verstappen n°1");
        System.out.println("Yuki Tsunoda n°22");
        System.out.println("Liam Lawson n°30");
        System.out.println("Isack Hadjar n°6");
        System.out.println("Charles Leclerc n°16");
        System.out.println("Lewis Hamilton n°44");
        System.out.println("Lando Norris n°4");
        System.out.println("Oscar Piastri n°81");
        System.out.println("George Russell n°63");
        System.out.println("Andrea Kimi Antonelli n°12");
        System.out.println("Fernando Alonso n°14");
        System.out.println("Lance Stroll n°18");
        System.out.println("Pierre Gasly n°10");
        System.out.println("Jack Doohan n°7");
        System.out.println("Esteban Ocon n°31");
        System.out.println("Oliver Bearman n°87");
        System.out.println("Nico Hülkenberg n°27");
        System.out.println("Gabriel Bortoleto n°5");
        System.out.println("Alex Albon n°23");
        System.out.println("Carlos Sainz n°55");
        System.out.println("");
    }

}
