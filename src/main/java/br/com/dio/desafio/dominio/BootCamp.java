package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {

    private String name;
    private String descricao;
    private final LocalDate dataInicial;
    private final LocalDate dataFinal;

    private Set<Dev> devs;
    private Set<Conteudo> conteudos;

    public BootCamp() {
        this.dataInicial = LocalDate.now();
        this.dataFinal = dataInicial.plusDays(45);
        this.devs = new HashSet<>();
        this.conteudos = new LinkedHashSet<>();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void addDev(Dev dev){
        devs.add(dev);
    }

    public void removeDev(Dev dev){
        devs.remove(dev);
    }

    public void addConteudo(Conteudo conteudo){
        conteudos.add(conteudo);
    }

    public void removeConteudo(Conteudo conteudo){
        conteudos.remove(conteudo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCamp = (BootCamp) o;
        return Objects.equals(name, bootCamp.name) && Objects.equals(descricao, bootCamp.descricao) && Objects.equals(dataInicial, bootCamp.dataInicial) && Objects.equals(dataFinal, bootCamp.dataFinal) && Objects.equals(devs, bootCamp.devs) && Objects.equals(conteudos, bootCamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, descricao, dataInicial, dataFinal, devs, conteudos);
    }
}
