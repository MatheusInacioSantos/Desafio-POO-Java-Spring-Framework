import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Angular");
        curso2.setDescricao("Descrição curso Angular");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev DevMatheus = new Dev();
        DevMatheus.setNome("Matheus");
        DevMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Matheus:" + DevMatheus.getConteudosInscritos());
        DevMatheus.progredir();
        DevMatheus.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Matheus:" + DevMatheus.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Matheus:" + DevMatheus.getConteudosConcluidos());
        System.out.println("XP:" + DevMatheus.calcularTotalXp());

        System.out.println("***********");

        Dev DevInacio = new Dev();
        DevInacio.setNome("Joao");
        DevInacio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Inácio:" + DevInacio.getConteudosInscritos());
        DevInacio.progredir();
        DevInacio.progredir();
        DevInacio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Inácio:" + DevInacio.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Inácio:" + DevInacio.getConteudosConcluidos());
        System.out.println("XP:" + DevInacio.calcularTotalXp());

    }

}
