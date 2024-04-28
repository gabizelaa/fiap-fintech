package br.com.classes_fintech.Entidades;

import java.util.ArrayList;

public class Meta {

    private String nomeMeta;
    private String dataInicio;
    private String dataTermino;
    private double valorMeta;

    public Meta(ArrayList<Meta> listaDeTodasMetas, String nomeMeta, String dataInicio, String dataTermino, double valorMeta) {
        this.nomeMeta = nomeMeta;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valorMeta = valorMeta;
    }

    public String getNomeMeta() {
        return nomeMeta;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public double getValorMeta() {
        return valorMeta;
    }


}