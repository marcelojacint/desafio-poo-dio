import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Conteudo curso = new Curso("lua a lua", "lua", 22);

        System.out.println(curso);

        Conteudo mentoria = new Mentoria("rever conceitos", "burros", LocalDate.now());
        System.out.println(mentoria);

        List<Conteudo> conteudos = new ArrayList<>();
        conteudos.add(curso);
        conteudos.add(mentoria);
        System.out.println();

        conteudos.forEach(System.out::println);
    }
}
