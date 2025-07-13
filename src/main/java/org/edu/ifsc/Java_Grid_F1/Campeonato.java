package org.edu.ifsc.Java_Grid_F1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Campeonato implements InterfaceFIA {

    //Lista que armazena cada corrida
    List<Corrida> listadeCorridas;

    //lista que armazena cada piloto
    List<Piloto> listadePiloto;

    //lista que armazena cada equipe
    List<Equipe> listadeEquipes;

    public Campeonato(List<Corrida> listadeCorridas, List<Piloto> listadePiloto, List<Equipe> listadeEquipes) {
        this.listadeCorridas = listadeCorridas;
        this.listadePiloto = listadePiloto;
        this.listadeEquipes = listadeEquipes;
    }

    @Override
    public void calculaPontuacoesCorrida(Corrida corrida) {
        //zerando a pontuação dos pilotos para evitar bugs de somar pontos a partir de outra função
        corrida.resultadoCorrida.forEach(piloto -> piloto.pontos=0);

        for (int i=0; i<corrida.resultadoCorrida.size(); i++){
            switch (i){
                case 0:
                    corrida.resultadoCorrida.get(i).set_pontos(25);
                    corrida.resultadoCorrida.get(i)._equipe.setPontos(25);
                    break;
                case 1:
                    corrida.resultadoCorrida.get(i).set_pontos(18);
                    corrida.resultadoCorrida.get(i)._equipe.setPontos(18);
                    break;
                case 2:
                    corrida.resultadoCorrida.get(i).set_pontos(15);
                    corrida.resultadoCorrida.get(i)._equipe.setPontos(15);
                    break;
                case 3:
                    corrida.resultadoCorrida.get(i).set_pontos(12);
                    corrida.resultadoCorrida.get(i)._equipe.setPontos(12);
                    break;
                case 4:
                    corrida.resultadoCorrida.get(i).set_pontos(10);
                    corrida.resultadoCorrida.get(i)._equipe.setPontos(10);
                    break;
                case 5:
                    corrida.resultadoCorrida.get(i).set_pontos(8);
                    corrida.resultadoCorrida.get(i)._equipe.setPontos(8);

                    break;
                case 6:
                    corrida.resultadoCorrida.get(i).set_pontos(6);
                    corrida.resultadoCorrida.get(i)._equipe.setPontos(6);

                    break;
                case 7:
                    corrida.resultadoCorrida.get(i).set_pontos(4);
                    corrida.resultadoCorrida.get(i)._equipe.setPontos(4);

                    break;
                case 8:
                    corrida.resultadoCorrida.get(i).set_pontos(2);
                    corrida.resultadoCorrida.get(i)._equipe.setPontos(2);

                    break;
                case 9:
                    corrida.resultadoCorrida.get(i).set_pontos(1);
                    corrida.resultadoCorrida.get(i)._equipe.setPontos(1);

                    break;

            }
        }
    }

    @Override
    public List<Equipe> calculaEquipesCampeonato(List<Corrida> corridas, List<Equipe> equipes) {
        //limpando as pontuações para evitar bugs
        listadePiloto.forEach(piloto -> {
            piloto.pontos = 0;
        });

        listadeEquipes.forEach(equipe -> {
            equipe.pontos = 0;
        });

        //passa de corrida a corrida pegando as pontuações de cada equipe e somando
        corridas.forEach(this::calculaPontuacoesCorrida);
        List<Equipe> resultadosConstrutores = new ArrayList<>(listadeEquipes);
        resultadosConstrutores.sort(Comparator.comparing(Equipe::getPontos));
        return resultadosConstrutores;
    }

    @Override
    public List<Piloto> calculaPilotosCampeonato(List<Corrida> corridas, List<Piloto> pilotos) {
        //limpando as pontuações para evitar bugs
        listadePiloto.forEach(piloto -> {
            piloto.pontos = 0;
        });

        listadeEquipes.forEach(equipe -> {
            equipe.pontos = 0;
        });

        //passa de corrida a corrida pegando as pontuações de cada piloto e somando
        corridas.forEach(this::calculaPontuacoesCorrida);
        List<Piloto> resultadoPilotos = new ArrayList<>(listadePiloto);
        resultadoPilotos.sort(Comparator.comparing(piloto -> -piloto.pontos));
        return resultadoPilotos;
    }


}
