package org.edu.ifsc.Java_Grid_F1;

public class Piloto{
    private final String _nome;
    private final String _equipe;
    private final long _tempoDeCorrida;

    public Piloto(String _nome, String _equipe, long _tempoDeCorrida) {
        this._nome = _nome;
        this._equipe = _equipe;
        this._tempoDeCorrida = _tempoDeCorrida;
    }

    public String get_nome() {
        return _nome;
    }

    public String get_equipe() {
        return _equipe;
    }

    public long get_tempoDeCorrida() {
        return _tempoDeCorrida;
    }

}
