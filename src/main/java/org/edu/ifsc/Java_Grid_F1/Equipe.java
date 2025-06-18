package org.edu.ifsc.Java_Grid_F1;

import java.util.List;

public class Equipe {
    final String nome;
    final int pontos;
    final List<Piloto> listaPilotos;

    public Equipe(String nome, List<Piloto> listaPilotos) {
        this.nome = nome;
        this.pontos = 0;
        this.listaPilotos = listaPilotos;
    }
}
