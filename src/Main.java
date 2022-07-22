import br.com.arianarusso.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1= new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("curso sobre java");
        curso1.setCargaHoraria(8);

        Curso curso2= new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("curso sobre JS");
        curso2.setCargaHoraria(4);



        Mentoria mentoria= new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp= new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila= new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos"+ devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos"+ devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos"+ devCamila.getConteudosConcluidos());
        System.out.println("XP: "+ devCamila.calcularTotalXP());

        System.out.println("-------------------");

        Dev devAriana = new Dev();
        devAriana.setNome("Ariana");
        devAriana.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos"+ devAriana.getConteudosInscritos());
        devAriana.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos"+ devAriana.getConteudosInscritos());
        System.out.println("Conteudos Concluidos"+ devAriana.getConteudosConcluidos());
        System.out.println("XP: "+ devAriana.calcularTotalXP());
    }
}
