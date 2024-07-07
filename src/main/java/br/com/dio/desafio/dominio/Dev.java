package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootCamp(BootCamp bootCamp) {
        this.conteudosConcluidos.addAll(bootCamp.getConteudos());
        bootCamp.getDevs().add(this); //adicionando um novo dev ao bootcamp
    }

    public void progredir() {
        Optional<Conteudo> conteudoProgredir = this.conteudosInscritos.stream().findFirst();
        if(conteudoProgredir.isPresent()){
            this.conteudosConcluidos.add(conteudoProgredir.get());
            this.conteudosInscritos.remove(conteudoProgredir.get());
        }else throw new NullPointerException("não existe conteúdos matriclados no bootcamp");
    }

    public double calcularTotalXp() {
      return  this.conteudosConcluidos.stream().mapToDouble(Conteudo::calculaXp).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, conteudosInscritos, conteudosConcluidos);
    }
}
