package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected final double XP_PADRAO = 10.0;

    protected String titulo;
    protected String descricao;

    public abstract double calculaXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
