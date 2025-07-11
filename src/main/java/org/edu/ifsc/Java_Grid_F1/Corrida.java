package org.edu.ifsc.Java_Grid_F1;

import java.util.List;

public class Corrida{
    public List<Piloto> resultadoCorrida;
    public String nomeCorrida;

    public Corrida(String nomeCorrida, List<Piloto> resultadoCorrida) {
        this.resultadoCorrida = resultadoCorrida;
        this.nomeCorrida = nomeCorrida;
    }



}
