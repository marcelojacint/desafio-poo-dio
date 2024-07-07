package br.com.dio.desafio.dominio;

import java.util.Objects;

public class Curso extends Conteudo {

    private Integer cargaHoratia;

    public Curso() {
    }

    public Curso(String titulo, String descricao, Integer cargaHoratia) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoratia = cargaHoratia;
    }

    @Override
    public double calculaXp() {
        return XP_PADRAO * cargaHoratia;
    }


    public Integer getCargaHoratia() {
        return cargaHoratia;
    }

    public void setCargaHoratia(Integer cargaHoratia) {
        this.cargaHoratia = cargaHoratia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(titulo, curso.titulo) && Objects.equals(descricao, curso.descricao) && Objects.equals(cargaHoratia, curso.cargaHoratia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, descricao, cargaHoratia);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "XP_PADRÂO=" + calculaXp() + '\'' +
                "titulo='" + titulo + '\'' +
                ", escricao='" + descricao + '\'' +
                ", cargaHoratia=" + cargaHoratia +
                '}';
    }
}
