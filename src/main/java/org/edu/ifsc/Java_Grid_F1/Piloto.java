package org.edu.ifsc.Java_Grid_F1;

import java.util.List;

public class Piloto{
    final String _nome;
    final String _numeroPiloto;
    public String equipe;
    public Equipe _equipe;
    int pontos;


    public Piloto(String _nome, String _numeroPiloto) {
        this._nome = _nome;
        this._numeroPiloto = _numeroPiloto;
        this.pontos = 0;
    }

    public void set_pontos(int pontos) {
        this.pontos += pontos;
    }
}
