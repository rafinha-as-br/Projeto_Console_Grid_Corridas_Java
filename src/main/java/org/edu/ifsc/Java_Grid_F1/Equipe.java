package org.edu.ifsc.Java_Grid_F1;

import java.util.List;

public class Equipe {
    final String nome;
    int pontos;
    List<Piloto> listaPilotos;

    public Equipe(String nome, List<Piloto> listaPilotos) {
        this.nome = nome;
        this.pontos = 0;
        this.listaPilotos = listaPilotos;
    }

    public void setPontos(int pontos) {
        this.pontos += pontos;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public List<Piloto> getListaPilotos() {
        return listaPilotos;
    }

    public void setListaPilotos(List<Piloto> listaPilotos) {
        this.listaPilotos = listaPilotos;
    }

    public static void listarEquipes(){
        System.out.println("Red Bull Racing");
        System.out.println("Racing Bulls");
        System.out.println("Ferrari");
        System.out.println("McLaren");
        System.out.println("Mercedes");
        System.out.println("Aston Martin");
        System.out.println("Alpine");
        System.out.println("Haas");
        System.out.println("Sauber (Stake)");
        System.out.println("Williams");
        System.out.println("");
    }
}
