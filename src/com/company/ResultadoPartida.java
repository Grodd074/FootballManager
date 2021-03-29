package com.company;

public class ResultadoPartida
{
    int golosEquipaCasa;
    int golosEquipaVisitante;

    public ResultadoPartida () {
        this.golosEquipaCasa = 0;
        this.golosEquipaVisitante = 0;
    }

    public ResultadoPartida(int golosEquipaCasa, int golosEquipaVisitante) {
        this.golosEquipaCasa = golosEquipaCasa;
        this.golosEquipaVisitante = golosEquipaVisitante;
    }
}
