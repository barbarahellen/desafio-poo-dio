import java.time.LocalDate;

import desafio.dominio.Bootcamp;
import desafio.dominio.Conteudo;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("javascript");
        curso2.setDescricao("descrição js");
        curso2.setCargaHoraria(20);

        //Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descrição bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("bárbara");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("conteúdos inscritos bárbara: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("-");
        System.out.println("conteúdos inscritos bárbara: " + dev1.getConteudosInscritos());
        System.out.println("conteúdos concluídos bárbara: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXp());

        System.out.println("-------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("sophia");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("conteúdos inscritos sophia : " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("conteúdos inscritos sophia: " + dev2.getConteudosInscritos());
        System.out.println("conteúdos concluídos sophia: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularXp());

    }
}
