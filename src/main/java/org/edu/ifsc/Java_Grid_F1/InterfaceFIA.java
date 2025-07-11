package org.edu.ifsc.Java_Grid_F1;

import java.util.List;

public interface InterfaceFIA {
    // Função de Calcular pontuações de corrida
    void calculaPontuacoesCorrida(Corrida corrida);

    // Função de calcular pontuações de equipes no campeonato (retorna uma lista de equipes ordenada)
    List<Equipe> calculaEquipesCampeonato(List<Corrida> corridas, List<Equipe> equipes);

    // Função de calcular pontuações de pilotos no campeonato (retorna uma lista de equipes ordenadas)
    List<Piloto> calculaPilotosCampeonato(List<Corrida> corridas, List<Piloto> pilotos);



}