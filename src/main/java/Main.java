import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Conteudo curso1 = new Curso("lua a lua", "lua", 22);
        Conteudo curso2 = new Curso("lua a lua", "lua", 22);
        Conteudo curso3 = new Curso("lua a lua", "lua", 22);



        Conteudo mentoria1 = new Mentoria("rever conceitos", "burros", LocalDate.now());
        Conteudo mentoria2 = new Mentoria("rever conceitos", "burros", LocalDate.now());
        Conteudo mentoria3 = new Mentoria("rever conceitos", "burros", LocalDate.now());


        BootCamp bootCamp = new BootCamp();
        bootCamp.setName("java");
        bootCamp.setDescricao("estudando");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(curso3);
        bootCamp.getConteudos().add(mentoria1);

        Dev gugu = new Dev();
        gugu.setName("gugu original");
        gugu.inscreverBootCamp(bootCamp);
        System.out.println("conteudos inscritos " + gugu.getConteudosInscritos());
        gugu.progredir();
        gugu.progredir();
        System.out.println("----------------------------------");
        System.out.println("conteudos inscritos " + gugu.getConteudosConcluidos());
        System.out.println("xp " + gugu.calcularTotalXp());
        System.out.println("conteudos inscritos " + gugu.getConteudosInscritos());
        System.out.println("----------------------------------");

        Dev jojo = new Dev();
        jojo.setName("jojo jaja");
        jojo.inscreverBootCamp(bootCamp);
        System.out.println("conteudos inscritos " + jojo.getConteudosInscritos());
        jojo.progredir();
        jojo.progredir();
        System.out.println("conteudos inscritos " + jojo.getConteudosConcluidos());
        System.out.println("xp " + jojo.calcularTotalXp());
        System.out.println("conteudos inscritos " + jojo.getConteudosInscritos());




    }
}
