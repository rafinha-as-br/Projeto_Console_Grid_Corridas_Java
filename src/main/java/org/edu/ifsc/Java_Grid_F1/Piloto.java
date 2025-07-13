package org.edu.ifsc.Java_Grid_F1;

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

}

