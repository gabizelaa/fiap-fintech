package br.com.fiap.fintech.MODELOS;

public class Meta {

    private int idMeta;
    private int idUser;
    private String nomeMeta;
    private double valorMeta;

    public Meta(int idUser, String nomeMeta, double valorMeta) {
        this.idUser = idUser;
        this.nomeMeta = nomeMeta;
        this.valorMeta = valorMeta;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getNomeMeta() {
        return nomeMeta;
    }

    public double getValorMeta() {
        return valorMeta;
    }

    public int getIdMeta() {
        return idMeta;
    }

    public void setIdMeta(int idMeta) {
        this.idMeta = idMeta;
    }

    @Override
    public String toString() {
        return String.format("Meta:\n" +
                        "\tID do Usuário: %d\n" +
                        "\tNome da Meta: %s\n" +
                        "\tValor da Meta: %.2f\n",
                idUser, nomeMeta, valorMeta, dataInicio, dataTermino);
    }
}
