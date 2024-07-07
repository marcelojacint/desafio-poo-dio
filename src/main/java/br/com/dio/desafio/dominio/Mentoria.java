package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.logging.SimpleFormatter;

public class Mentoria extends Conteudo {

    private LocalDate data;
    private String formatterDate;

    public Mentoria() {
    }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.formatterDate = data.format(dateTimeFormatter);


    }

    public String getFormatterDate() {
        return formatterDate;
    }

    @Override
    public double calculaXp() {
        return XP_PADRAO + 20.0;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mentoria mentoria = (Mentoria) o;
        return Objects.equals(titulo, mentoria.titulo) && Objects.equals(descricao, mentoria.descricao) && Objects.equals(data, mentoria.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, descricao, data);
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "XP=" + calculaXp() + '\'' +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + formatterDate +
                '}';
    }
}