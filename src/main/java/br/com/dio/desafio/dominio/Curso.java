package br.com.dio.desafio.dominio;

import java.util.Objects;

public class Curso {

    private String titulo;
    private String escricao;
    private Integer cargaHoratia;

    public Curso() {
    }

    public Curso(String titulo, String escricao, Integer cargaHoratia) {
        this.titulo = titulo;
        this.escricao = escricao;
        this.cargaHoratia = cargaHoratia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEscricao() {
        return escricao;
    }

    public void setEscricao(String escricao) {
        this.escricao = escricao;
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
        return Objects.equals(titulo, curso.titulo) && Objects.equals(escricao, curso.escricao) && Objects.equals(cargaHoratia, curso.cargaHoratia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, escricao, cargaHoratia);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", escricao='" + escricao + '\'' +
                ", cargaHoratia=" + cargaHoratia +
                '}';
    }
}
