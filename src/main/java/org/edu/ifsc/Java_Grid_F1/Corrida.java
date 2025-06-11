package org.edu.ifsc.Java_Grid_F1;

import java.util.List;

public class Corrida implements InterfaceCorrida{
    private final int _numeroVoltas;
    private final List<Piloto> _listaPilotos;

    public int get_numeroVoltas() {
        return _numeroVoltas;
    }

    public List<Piloto> get_listaPilotos() {
        return _listaPilotos;
    }

    public Corrida(int _numeroVoltas, List<Piloto> _listaPilotos) {
        this._numeroVoltas = _numeroVoltas;
        this._listaPilotos = _listaPilotos;
    }



}
