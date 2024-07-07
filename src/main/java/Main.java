import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso("lua a lua", "lua", 22);

        System.out.println(curso);

        Mentoria mentoria = new Mentoria("rever conceitos", "burros", LocalDate.now());
        System.out.println(mentoria);
    }
}
