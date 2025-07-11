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

}
