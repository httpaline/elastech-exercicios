package io.github.httpaline.elastech.semana3.heranca;

public class Main {

    static void main() {
        Aluna aluna = new Aluna();
        aluna.nome = "Aline";
        aluna.idade = 25;
        aluna.curso = "Sistemas de Informação";

        //aluna.apresentar();
        //aluna.estudar();

        Professora prof = new Professora();
        prof.nome = "Florinha";
        prof.idade = 30;
        prof.disciplina = "Java+IA#ElasTech";

        aluna.apresentar();
        aluna.estudar();
        prof.apresentar();
        prof.lancarNota(aluna.nome,100);

        Gerente gerente = new Gerente();
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "João";
        gerente.nome = "Vitor";
        Diretora diretora = new Diretora();
        diretora.nome = "Carla";
        diretora.baterPonto();
        diretora.aprovarFerias(gerente.nome);
        diretora.definirMeta("melhorar o marketing");

        gerente.baterPonto();
        gerente.aprovarFerias(funcionario1.nome);
        gerente.notificar("Notificação");
        gerente.exportar();


    }
}
