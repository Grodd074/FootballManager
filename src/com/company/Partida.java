package com.company;

public class Partida
{
    Equipa equipaCasa;
    Equipa equipaVisitante;

    public Partida(Equipa eCasa, Equipa eVisitante) {
        this.equipaCasa = eCasa;
        this.equipaVisitante = eVisitante;
    }

    ResultadoPartida jogarPartida () {
        int golosEquipaCasa = 0;
        int golosEquipaVisitante = 0;

        float habEquipaCasa = equipaCasa.getAtributosEquipa().getHabilidade() / equipaCasa.getAtributosEquipa().listaJogadores.size();
        float habEquipaVis = equipaVisitante.getAtributosEquipa().getHabilidade() / equipaCasa.getAtributosEquipa().listaJogadores.size();

        System.out.println("habEquipaCasa= " + habEquipaCasa + "\n" + "habEquipaVis= " + habEquipaVis);

        return new ResultadoPartida(golosEquipaCasa, golosEquipaVisitante);
    }
}
